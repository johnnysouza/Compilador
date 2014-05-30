package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;
import javax.swing.text.BadLocationException;

import br.com.furb.lexico.AnalysisError;
import br.com.furb.lexico.BuscaClasse;
import br.com.furb.lexico.Constants;
import br.com.furb.lexico.LexicalError;
import br.com.furb.lexico.Lexico;
import br.com.furb.lexico.SemanticError;
import br.com.furb.lexico.Semantico;
import br.com.furb.lexico.Sintatico;
import br.com.furb.lexico.SyntaticError;
import br.com.furb.lexico.Token;
import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoCompilar extends JButton implements Acao {
	private static final long serialVersionUID = 1L;
	BuscaClasse buscaClasse = new BuscaClasse();

	public BotaoCompilar() {
		super();
	}

	public BotaoCompilar(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		if (!frame.getTextEditor().getText().isEmpty()) {
			Lexico lexico = new Lexico();
			lexico.setInput(frame.getTextEditor().getText());
			Sintatico sintatico = new Sintatico();
			Semantico semantico = null;
			try {
				sintatico.parse(lexico, semantico);
				frame.getTextMsg().setText("\tPrograma compilado com sucesso!");
			} catch (LexicalError e) {
				StringBuilder sb = new StringBuilder();
				tratarLinhaErroCompilacao(sb, frame, e);
				if (e.getMessage().equalsIgnoreCase("símbolo inválido")) {
					sb.append(String.valueOf(frame.getTextEditor().getText()
							.charAt(e.getPosition())));
					sb.append(" ");
				}
				sb.append(e.getMessage());
				frame.getTextMsg().setText(sb.toString());
			} catch (SyntaticError e) {
				StringBuilder sb = new StringBuilder();
				tratarLinhaErroCompilacao(sb, frame, e);
				sb.append("encontrado ");
				
				Token tokenErro = sintatico.getCurrentToken();
				int idToken = tokenErro.getId();
				if (idToken == Constants.t_identificador) {
					sb.append(BuscaClasse.buscaNomeClasse(idToken));
					sb.append(" (");
					sb.append(getLexema(tokenErro));
					sb.append(") ");
				} else {
					//TODO tratar demais erros conforme instruções da definição do trabalho
					sb.append(getLexema(tokenErro));
					sb.append(" ");
				}
				
				
				sb.append(e.getMessage());
				frame.getTextMsg().setText(sb.toString());
			} catch (SemanticError e) {
				// não acontece ainda
			}
		} else {
			frame.getTextMsg().setText("Nenhum programa para compilar!");
		}
	}

	public void tratarLinhaErroCompilacao(StringBuilder sb,
			CompilerInterface frame, AnalysisError e) {
		sb.append("Erro na linha ");
		try {
			int linha = frame.getTextEditor().getLineOfOffset(e.getPosition()) + 1;
			sb.append(linha);
		} catch (BadLocationException e1) {
			System.err.println("Linha do caractere não encontrada");
		}
		sb.append(" - ");
	}
	
	private String getLexema(Token tokenErro) {
		String lexema = tokenErro.getLexeme();
		if (lexema.equals("$")) {
			lexema = "fim do programa";
		} 
		return lexema;
	}

}
