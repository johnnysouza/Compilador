package br.com.furb.lexico;

public enum ClasseEnum {

	CLASSE_0(0,   "0                "),
	CLASSE_1(1,   "1                "),
	CLASSE_2(2,   "identificador    "),
	CLASSE_3(3,   "constante integer"),
	CLASSE_4(4,   "constante float  "),
	CLASSE_5(5,   "constante string "),
	CLASSE_6(6,   "s�mbolo especial "),
	CLASSE_7(7,   "s�mbolo especial "),
	CLASSE_8(8,   "s�mbolo especial "),
	CLASSE_9(9,   "s�mbolo especial "),
	CLASSE_10(10, "s�mbolo especial "),
	CLASSE_11(11, "s�mbolo especial "),
	CLASSE_12(12, "s�mbolo especial "),
	CLASSE_13(13, "s�mbolo especial "),
	CLASSE_14(14, "s�mbolo especial "),
	CLASSE_15(15, "s�mbolo especial "),
	CLASSE_16(16, "s�mbolo especial "),
	CLASSE_17(17, "s�mbolo especial "),
	CLASSE_18(18, "s�mbolo especial "),
	CLASSE_19(19, "s�mbolo especial "),
	CLASSE_20(20, "s�mbolo especial "),
	CLASSE_21(21, "s�mbolo especial "),
	CLASSE_22(22, "s�mbolo especial "),
	CLASSE_23(23, "s�mbolo especial "),
	CLASSE_24(24, "palavra reservada"),
	CLASSE_25(25, "palavra reservada"),
	CLASSE_26(26, "palavra reservada"),
	CLASSE_27(27, "palavra reservada"),
	CLASSE_28(28, "palavra reservada"),
	CLASSE_29(29, "palavra reservada"),
	CLASSE_30(30, "palavra reservada"),
	CLASSE_31(31, "palavra reservada"),
	CLASSE_32(32, "palavra reservada"),
	CLASSE_33(33, "palavra reservada"),
	CLASSE_34(34, "palavra reservada"),
	CLASSE_35(35, "palavra reservada"),
	CLASSE_36(36, "palavra reservada"),
	CLASSE_37(37, "palavra reservada"),
	CLASSE_38(38, "palavra reservada"),
	CLASSE_39(39, "palavra reservada");
	
	
	
	private int identificador;
	private String mensagem;

	private ClasseEnum(int identificador, String mensagem) {
		this.identificador = identificador;
		this.mensagem = mensagem;
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	
}
