package br.com.furb.ui.barraFerramentas.botoes;

import br.com.furb.comum.BuscaClasse;
import br.com.furb.ui.CompilerInterface;

public class BotaoCompilar extends Compila {
	private static final long serialVersionUID = 1L;
	BuscaClasse buscaClasse = new BuscaClasse();

	public BotaoCompilar() {
		super();
	}

	public BotaoCompilar(String texto) {
		super(texto);
	}

	@Override
	public void executaAcao(CompilerInterface frame) {
		if (!frame.getTextEditor().getText().isEmpty()) {
			Compila.compilar(frame, "", "\tPrograma compilado com sucesso!");
		} else {
			frame.getTextMsg().setText("Nenhum programa para compilar!");
		}
	}

}
