package br.com.furb.semantico;

public class LabelsSelecao {
	
	private String[] labels;
	private static final int LB_ELSE = 0;
	private static final int LB_SAIDA = 1;
	private static final int QNT_LABELS = 2;
	
	public LabelsSelecao() {
		labels = new String[QNT_LABELS];
	}
	
	public void setLabelElse(String labelElse) {
		labels[LB_ELSE] = labelElse;
	}
	
	public String getLabelElse() {
		return labels[LB_ELSE];
	}
	
	public void setLabelSaida(String labelSaida) {
		labels[LB_SAIDA] = labelSaida;
	}
	
	public String getLabelSaida() {
		return labels[LB_SAIDA];
	}

}
