package br.com.furb.ui.barraFerramentas.botoes;

import br.com.furb.comum.BuscaClasse;
import br.com.furb.ui.CompilerInterface;
import br.com.furb.ui.barraFerramentas.acao.AcaoCompilar;

public class BotaoCompilar extends AcaoCompilar {
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
			AcaoCompilar.compilar(frame, "", "\tPrograma compilado com sucesso!");
		} else {
			frame.getTextMsg().setText("Nenhum programa para compilar!");
		}
	}

}
