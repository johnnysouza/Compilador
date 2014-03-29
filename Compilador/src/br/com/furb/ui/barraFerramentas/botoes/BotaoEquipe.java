package br.com.furb.ui.barraFerramentas.botoes;

import javax.swing.JButton;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoEquipe extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoEquipe() {
		super();
	}

	public BotaoEquipe(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		frame.getTextMsg().setText("Integrantes Equipe: Carlos Alberto Curbani, Felipe Loose Corso, Jonathan de Souza\n");
	}
}
