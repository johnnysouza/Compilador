package br.com.furb.ui.barraFerramentas.botoes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;

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
		String filePath;
		JFileChooser file = new JFileChooser();
		file.setCurrentDirectory(new File("C:\\"));
		file.setFileSelectionMode(JFileChooser.FILES_ONLY);

		if (file.showOpenDialog(file) == JFileChooser.APPROVE_OPTION) {
			filePath = file.getSelectedFile().getPath();
		} else {
			filePath = "";
		}
		String texto = "";
		if (!filePath.equalsIgnoreCase("")) {
			texto = textFileRead(filePath);
			frame.getLbFilePath().setText(filePath);
			frame.getTextEditor().setText(texto);
			frame.getKeyListener().setTextoEditor("");
			frame.getLbStatus().setText("Não modificado");
		} else {
			frame.getTextMsg().setText("Arquivo inválido!");
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
