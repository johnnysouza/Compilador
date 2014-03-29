package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoGerarCodigo extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoGerarCodigo() {
		super();
	}

	public BotaoGerarCodigo(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		frame.getTextMsg().setText("Gerador de código não implementado ainda.\n");
	}
}
