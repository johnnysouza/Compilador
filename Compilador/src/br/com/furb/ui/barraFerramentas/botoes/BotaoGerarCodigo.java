package br.com.furb.ui.barraFerramentas.botoes;

import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.Acao;
import br.com.furb.ui.barraFerramentas.acao.AcaoCompilar;
import br.com.furb.ui.barraFerramentas.acao.AcaoSalvar;

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
		if (!frame.getTextEditor().getText().isEmpty()) {
			if (isProgramaSalvo(frame)) {
				try {
					boolean compSucesso = AcaoCompilar.compilar(frame, getFileName(frame), "\tCódigo objeto gerado com sucesso!");
					if (compSucesso) {
						AcaoSalvar.salvar(getFilePath(frame), AcaoCompilar.getSemantico().getCodigo().toString());
					}
				} catch (IOException e) {
					System.err.println("ERRO FATAL!\nNão foi possível salvar o arquivo!");
					e.printStackTrace();
				}
			} else {
				int retorno = JOptionPane.showConfirmDialog(frame, "Deseja salvar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
				if (retorno == JOptionPane.YES_OPTION) {
					new BotaoSalvar().executaAcao(frame);
				}
			}
		} else {
			frame.getTextMsg().setText("Nenhum programa para gerar código!");
		}
	}

	private String getFileName(CompilerInterface frame) {
		File file = new File(frame.getLbFilePath().getText());
		String name = file.getName();
		return name.substring(0, name.lastIndexOf("."));
	}

	private String getFilePath(CompilerInterface frame) {
		String filePath = frame.getLbFilePath().getText();
		return filePath.substring(0, filePath.lastIndexOf(".") + 1).concat("il");
	}

	private boolean isProgramaSalvo(CompilerInterface frame) {
		return !frame.getLbFilePath().getText().isEmpty();
	}

}
