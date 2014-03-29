package br.com.furb.ui.barraFerramentas.botoes;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;

import br.com.furb.enumeracao.EStatus;
import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoAbrir extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoAbrir() {
		super();
	}

	public BotaoAbrir(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		String filePath = "";
		FileDialog fileDialog = new FileDialog(frame, "Abrir", FileDialog.LOAD);
		fileDialog.setDirectory("C:\\");
		fileDialog.setVisible(true);

		filePath = fileDialog.getDirectory() + fileDialog.getFile();

		if (!filePath.equalsIgnoreCase("C:\\null")) {
			frame.getLbFilePath().setText(filePath);
			frame.getTextEditor().setText(textFileRead(filePath));
			frame.getKeyListener().setTextoEditor("");
			frame.getTextMsg().setText("");
			frame.getLbStatus().setText(EStatus.NAO_MODIFICADO.toString());
		}
	}

	public String textFileRead(String filePath) {
		String text = "";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(filePath));
			while (br.ready()) {
				text += br.readLine() + "\n";
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			text = "";
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return text;
	}
}
