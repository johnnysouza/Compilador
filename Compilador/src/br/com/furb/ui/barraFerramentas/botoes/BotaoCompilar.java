package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoCompilar extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoCompilar() {
		super();
	}
	
	public BotaoCompilar(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		frame.getTextMsg().append("Compilador n�o implementado ainda.\n");
	}
}