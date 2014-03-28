package br.com.furb.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;

import br.com.furb.ui.barraFerramentas.botoes.BotaoAbrir;
import br.com.furb.ui.barraFerramentas.botoes.BotaoColar;
import br.com.furb.ui.barraFerramentas.botoes.BotaoCompilar;
import br.com.furb.ui.barraFerramentas.botoes.BotaoCopiar;
import br.com.furb.ui.barraFerramentas.botoes.BotaoEquipe;
import br.com.furb.ui.barraFerramentas.botoes.BotaoGerarCodigo;
import br.com.furb.ui.barraFerramentas.botoes.BotaoNovo;
import br.com.furb.ui.barraFerramentas.botoes.BotaoRecortar;
import br.com.furb.ui.barraFerramentas.botoes.BotaoSalvar;

public class ShortCutListener implements KeyListener {
	
	private CompilerInterface compUi;
	
	public ShortCutListener (CompilerInterface compUi) {
		this.compUi = compUi;
	}

	@Override
	public void keyPressed(KeyEvent event) {
		boolean isCtrlDown = event.isControlDown();
		switch(event.getKeyCode()) {
		case KeyEvent.VK_N: 
			if (isCtrlDown) {
				new BotaoNovo().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_A:
			if (isCtrlDown) {
				new BotaoAbrir().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_S:
			if (isCtrlDown) {
				new BotaoSalvar().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_C:
			if (isCtrlDown) {
				new BotaoCopiar().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_V:
			if (isCtrlDown) {
				new BotaoColar().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_X:
			if (isCtrlDown) {
				new BotaoRecortar().executaAcao(compUi);
			}
			break;
		case KeyEvent.VK_F8:
			new BotaoCompilar().executaAcao(compUi);
			break;
		case KeyEvent.VK_F9:
			new BotaoGerarCodigo().executaAcao(compUi);
			break;
		case KeyEvent.VK_F1:
			new BotaoEquipe().executaAcao(compUi);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

}
