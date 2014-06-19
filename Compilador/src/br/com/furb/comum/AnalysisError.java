package br.com.furb.comum;

public class AnalysisError extends Exception {
	private static final long serialVersionUID = -3414491548565962175L;
	private int position;

	public AnalysisError(String msg, int position) {
		super(msg);
		this.position = position;
	}

	public AnalysisError(String msg) {
		super(msg);
		this.position = -1;
	}

	public int getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return super.toString() + ", @ " + position;
	}
}
