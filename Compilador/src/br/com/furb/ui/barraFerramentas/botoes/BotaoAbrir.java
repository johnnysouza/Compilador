package br.com.furb.ui.barraFerramentas.botoes;

import java.awt.FileDialog;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

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
			try {
				// 1º tenta ler depois seta o caminho do arquivo e as demais informações
				frame.getTextEditor().setText(textFileRead(filePath));
				frame.getLbFilePath().setText(filePath);
				frame.getKeyListener().setTextoEditor("");
				frame.getTextMsg().setText("");
				frame.getLbStatus().setText(EStatus.NAO_MODIFICADO.toString());
				frame.getKeyListener().setTextoEditor(frame.getTextEditor().getText());
			} catch (ClassNotFoundException | IOException e) {
				System.err.println("ERRO FATAL!\nNão foi possível realizar a leitura do arquivo!");
				e.printStackTrace();
			}

		}
	}

	public String textFileRead(String name) throws IOException, ClassNotFoundException {
		String text = "";

		FileInputStream fs = new FileInputStream(name);
		BufferedInputStream bs = new BufferedInputStream(fs);
		ObjectInputStream objInput = new ObjectInputStream(bs);

		text = (String) objInput.readObject();

		objInput.close();
		bs.close();
		fs.close();

		return text;
	}
}
