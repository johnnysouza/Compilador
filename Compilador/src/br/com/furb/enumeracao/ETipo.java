package br.com.furb.enumeracao;

public enum ETipo {
	INT("int"), BOOLEAN("boolean"), FLOAT("float");
	private String desc = "";

	private ETipo(String descTipo) {
		this.desc = descTipo;
	}

	@Override
	public String toString() {
		return this.desc;
	}
}
