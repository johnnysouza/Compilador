package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoNovo extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoNovo() {
		super();
	}
	
	public BotaoNovo(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		frame.getTextEditor().setText("");
		frame.getTextMsg().setText("");
		frame.getLbFilePath().setText("");
		frame.getKeyListener().setTextoEditor("");
		frame.getLbStatus().setText("Não modificado");
	}
}
