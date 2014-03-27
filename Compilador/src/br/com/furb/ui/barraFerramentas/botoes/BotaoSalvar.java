package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoSalvar extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoSalvar(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		// FIXME Implementar funcao
	}
}
