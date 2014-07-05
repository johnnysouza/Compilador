package br.com.furb.enumeracao;

public enum ETipo {
	INT(Integer.TYPE.getSimpleName(), "int64", "Int64"), /**/
	BOOLEAN(Boolean.TYPE.getSimpleName(), "bool", Boolean.class.getSimpleName()), /**/
	FLOAT(Float.TYPE.getSimpleName(), "float64", Double.class.getSimpleName()), /**/
	STRING(String.class.getSimpleName(), "string", "");

	private String desc = "";
	private String tipoMSIL = "";
	private String classe;

	private ETipo(String descTipo, String tipoMSIL, String classe) {
		this.desc = descTipo;
		this.tipoMSIL = tipoMSIL;
		this.classe = classe;
	}

	@Override
	public String toString() {
		return this.desc;
	}

	public String getTipoMSIL() {
		return tipoMSIL;
	}

	public String getClasse() {
		return classe;
	}
	
	public static String findClasseFromTipoMSIL(String tipoMSIL) {
		for (ETipo tipo : values()) {
			if (tipo.getTipoMSIL().equalsIgnoreCase(tipoMSIL)) {
				return tipo.getClasse();
			}
		}
		return "";
	}
	
	public static String findDescFromTipoMSIL(String tipoMSIL) {
		for (ETipo tipo : values()) {
			if (tipo.getTipoMSIL().equalsIgnoreCase(tipoMSIL)) {
				return tipo.toString();
			}
		}
		return "";
	}
}
