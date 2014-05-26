package br.com.furb.lexico;

public class BuscaClasse {

	public static String buscaNomeClasse(int idClasse) {
		return ClasseEnum.values()[idClasse].getMensagem();
	}
}
