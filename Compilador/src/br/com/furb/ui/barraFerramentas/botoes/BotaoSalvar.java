package br.com.furb.ui.barraFerramentas.botoes;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import br.com.furb.enumeracao.EStatus;
import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;

public class BotaoSalvar extends JButton implements Acao {
	private static final long serialVersionUID = 1L;

	public BotaoSalvar() {
		super();
	}

	public BotaoSalvar(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		if (frame.getLbStatus().getText().equalsIgnoreCase(EStatus.MODIFICADO.toString())) {
			String absolutePath = frame.getLbFilePath().getText();

			if (absolutePath.isEmpty()) {
				Dialog dialog = new Dialog(frame, "Informe o diretório e o nome do arquivo", FileDialog.SAVE);

				dialog.abrirFrame();
				absolutePath = dialog.getAbsolutePath();
			}

			try {
				if (!absolutePath.equalsIgnoreCase("C:\\null")) {
					salvar(absolutePath, frame.getTextEditor().getText());
					frame.getLbFilePath().setText(absolutePath);
					frame.getTextMsg().setText("");
					frame.getLbStatus().setText(EStatus.NAO_MODIFICADO.toString());
				}
			} catch (IOException e) {
				System.err.println("ERRO FATAL!\nNão foi possível salvar o arquivo!");
				e.printStackTrace();
			}
		}
	}

	private void salvar(String absolutePath, String buffer) throws IOException {
		FileOutputStream fileOutPutStream = new FileOutputStream(absolutePath, false);
		BufferedOutputStream bufferedOutPutStream = new BufferedOutputStream(fileOutPutStream);

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutPutStream);
		objectOutputStream.writeObject(buffer);
		objectOutputStream.flush();
		objectOutputStream.close();

		bufferedOutPutStream.flush();
		bufferedOutPutStream.close();

		fileOutPutStream.flush();
		fileOutPutStream.close();

	}

	private class Dialog extends FileDialog {

		public Dialog(Frame parent, String title, int mode) {
			super(parent, title, mode);
		}

		private static final long serialVersionUID = 1L;
		private String absolutePath;

		public void abrirFrame() {
			this.setDirectory("C:\\");
			this.setVisible(true);

			absolutePath = this.getDirectory() + this.getFile();
		}

		public String getAbsolutePath() {
			return absolutePath;
		}
	}
}
