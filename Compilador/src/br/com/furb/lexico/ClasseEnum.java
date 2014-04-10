package br.com.furb.lexico;

public enum ClasseEnum {

	CLASSE_0(0,   "0                "),
	CLASSE_1(1,   "1                "),
	CLASSE_2(2,   "identificador    "),
	CLASSE_3(3,   "constante integer"),
	CLASSE_4(4,   "constante float  "),
	CLASSE_5(5,   "constante string "),
	CLASSE_6(6,   "símbolo especial "),
	CLASSE_7(7,   "símbolo especial "),
	CLASSE_8(8,   "símbolo especial "),
	CLASSE_9(9,   "símbolo especial "),
	CLASSE_10(10, "símbolo especial "),
	CLASSE_11(11, "símbolo especial "),
	CLASSE_12(12, "símbolo especial "),
	CLASSE_13(13, "símbolo especial "),
	CLASSE_14(14, "símbolo especial "),
	CLASSE_15(15, "símbolo especial "),
	CLASSE_16(16, "símbolo especial "),
	CLASSE_17(17, "símbolo especial "),
	CLASSE_18(18, "símbolo especial "),
	CLASSE_19(19, "símbolo especial "),
	CLASSE_20(20, "símbolo especial "),
	CLASSE_21(21, "símbolo especial "),
	CLASSE_22(22, "símbolo especial "),
	CLASSE_23(23, "símbolo especial "),
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
