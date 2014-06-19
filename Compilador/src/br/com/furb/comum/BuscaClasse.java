package br.com.furb.comum;

public class BuscaClasse {

	public static String buscaNomeClasse(int idClasse) {
		return ClasseEnum.values()[idClasse].getMensagem();
	}
}
