package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;
import javax.swing.text.BadLocationException;

import br.com.furb.lexico.BuscaClasse;
import br.com.furb.lexico.LexicalError;
import br.com.furb.lexico.Lexico;
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
			try {
				Token t = null;
				StringBuilder listaTokens = new StringBuilder();
				listaTokens.append("linha");
				listaTokens.append("\t");
				listaTokens.append("classe");
				listaTokens.append("\t\t");
				listaTokens.append("lexema");
				listaTokens.append("\n");
				while ((t = lexico.nextToken()) != null) {
					int linha = -1;
					try {
						linha = frame.getTextEditor().getLineOfOffset(t.getPosition()) + 1;
					} catch (BadLocationException e) {
						e.printStackTrace();
					}
					listaTokens.append(linha);
					listaTokens.append("\t");
					listaTokens.append(buscaClasse.buscaNomeClasse(t.getId()));
					listaTokens.append("\t");
					listaTokens.append(t.getLexeme());
					listaTokens.append("\n");
				}
				listaTokens.append("\t");
				listaTokens.append("Programa compilado com sucesso!");
				frame.getTextMsg().setText(listaTokens.toString());
			} catch (LexicalError e) {

				StringBuilder sb = new StringBuilder();
				sb.append("Erro na linha ");
				try {
					int linha = frame.getTextEditor().getLineOfOffset(e.getPosition()) + 1;
					sb.append(linha);
				} catch (BadLocationException e1) {
					System.err.println("Linha do caractere não encontrada");
				}
				sb.append(" - ");
				if (e.getMessage().equalsIgnoreCase("símbolo inválido")) {
					sb.append(String.valueOf(frame.getTextEditor().getText().charAt(e.getPosition())));
				}
				sb.append(" ");
				sb.append(e.getMessage());
				frame.getTextMsg().setText(sb.toString());
			}
		} else {
			frame.getTextMsg().setText("Nenhum programa para compilar!");
		}
	}
}
