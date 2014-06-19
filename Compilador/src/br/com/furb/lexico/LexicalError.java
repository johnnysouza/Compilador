package br.com.furb.lexico;

import br.com.furb.comum.AnalysisError;

public class LexicalError extends AnalysisError {
	private static final long serialVersionUID = -7162883068807983250L;

	public LexicalError(String msg, int position) {
		super(msg, position);
	}

	public LexicalError(String msg) {
		super(msg);
	}
}
