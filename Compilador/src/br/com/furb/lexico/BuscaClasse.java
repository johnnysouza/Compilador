package br.com.furb.lexico;

public class BuscaClasse {

	public String buscaNomeClasse(int idClasse) {
		return ClasseEnum.values()[idClasse].getMensagem();
	}
}
