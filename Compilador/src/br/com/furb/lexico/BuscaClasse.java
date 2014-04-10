package br.com.furb.lexico;

public class BuscaClasse {
	ClasseEnum classeEnum;

	public String buscaNomeClasse(int idClasse) {

		return classeEnum.values()[idClasse].getMensagem();
	}
}
