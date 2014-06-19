package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;
import javax.swing.text.BadLocationException;

import br.com.furb.comum.AnalysisError;
import br.com.furb.comum.BuscaClasse;
import br.com.furb.comum.Constants;
import br.com.furb.comum.Token;
import br.com.furb.lexico.LexicalError;
import br.com.furb.lexico.Lexico;
import br.com.furb.semantico.SemanticError;
import br.com.furb.semantico.Semantico;
import br.com.furb.sintatico.Sintatico;
import br.com.furb.sintatico.SyntaticError;
import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

abstract class Compila extends JButton implements Acao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5927631739431915460L;

	public Compila(String texto) {
		super(texto);
	}

	public Compila() {
		super();
	}

	public static void compilar(CompilerInterface frame, String nomeArquivo, String msgStatus) {
		Lexico lexico = new Lexico();
		lexico.setInput(frame.getTextEditor().getText());
		Sintatico sintatico = new Sintatico();
		Semantico semantico = new Semantico(nomeArquivo);
		try {
			sintatico.parse(lexico, semantico);
			frame.getTextMsg().setText(msgStatus);
		} catch (LexicalError e) {
			StringBuilder sb = new StringBuilder();
			tratarLinhaErroCompilacao(sb, frame, e);
			if (e.getMessage().equalsIgnoreCase("símbolo inválido")) {
				sb.append(String.valueOf(frame.getTextEditor().getText().charAt(e.getPosition())));
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
				sb.append(getLexema(tokenErro));
				sb.append(" ");
			}

			sb.append(e.getMessage());
			frame.getTextMsg().setText(sb.toString());
		} catch (SemanticError e) {
			// não acontece ainda
		}

	}

	public static void tratarLinhaErroCompilacao(StringBuilder sb, CompilerInterface frame, AnalysisError e) {
		sb.append("Erro na linha ");
		try {
			int linha = frame.getTextEditor().getLineOfOffset(e.getPosition()) + 1;
			sb.append(linha);
		} catch (BadLocationException e1) {
			System.err.println("Linha do caractere não encontrada");
		}
		sb.append(" - ");
	}

	private static String getLexema(Token tokenErro) {
		String lexema = tokenErro.getLexeme();
		if (lexema.equals("$")) {
			lexema = "fim do programa";
		}
		return lexema;
	}
}
