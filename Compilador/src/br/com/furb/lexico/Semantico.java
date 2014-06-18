package br.com.furb.lexico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import br.com.furb.enumeracao.ETipo;

public class Semantico implements Constants {
	private StringBuilder codigo;
	private Stack<String> pilhaTipo;
	private Map<String, String> tabelaSimbolo;
	private List<String> lista;

	public Semantico() {
		this.codigo = new StringBuilder();
		this.tabelaSimbolo = new HashMap<>();
		this.lista = new ArrayList<>();
	}

	public void executeAction(int action, Token token) throws SemanticError {
		System.out.println("Ação #" + action + ", Token: " + token);

		switch (action) {
		case 1:
			acao_01();
			break;
		case 2:
			acao_02();
			break;
		case 3:
			acao_03();
			break;
		case 4:
			acao_04();
			break;
		case 5:
			acao_05(token);
			break;
		case 6:
			acao_06(token);
			break;
		case 7:
			acao_07();
			break;
		case 8:
			acao_08();
			break;
		case 9:
			acao_09();
			break;
		case 10:
			acao_10();
			break;
		case 11:
			acao_11(token);
			break;
		case 12:
			acao_12();
			break;
		case 13:
			acao_13();
			break;
		case 14:
			acao_14();
			break;
		case 24:
			acao_24(token);
			break;
		case 25:
			acao_25(token);
			break;
		case 26:
			acao_26();
			break;
		case 27:
			acao_27();
			break;
		case 28:
			acao_28(token);
			break;
		case 29:
			acao_29(token);
			break;
		}

	}

	private void acao_0(Token token) {
		tabelaSimbolo.put(token.getLexeme(), "prog");
	}

	private void acao_01() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (isFloat(tipo1) || isFloat(tipo2)) {
			empilhaFloat();
		} else {
			empilhaInt();
		}

		codigo.append("add/n");

	}

	private void acao_02() {
		pilhaTipo.pop();
		pilhaTipo.pop();

		empilhaFloat();

		codigo.append("sub/n");
	}

	private void acao_03() {
		empilhaInt();
		codigo.append("mul/n");
	}

	private void acao_04() {
		pilhaTipo.push(ETipo.FLOAT.toString());
		codigo.append("div/n");
	}

	private void acao_05(Token token) {
		codigo.append("ldc.i8 " + token.getLexeme());
	}

	private void acao_06(Token token) {
		codigo.append("ldc.r8 " + token.getLexeme());
	}

	private void acao_07() {
		codigo.append("ldc.i8 -1");
		codigo.append("mul/n");
	}

	private void acao_08() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codigo.append("clt/n");
		} else {
			// senão erro semântico, halt
		}

	}

	private void acao_09() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();
		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codigo.append("cgt/n");
		} else {
			// senão erro semântico, halt
		}
	}

	private void acao_10() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();
		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codigo.append("ceq/n");
		} else {
			// senão erro semântico, halt
		}
	}

	private void acao_11(Token token) {
		pilhaTipo.push(ETipo.BOOLEAN.toString());
		if (token.getLexeme().equalsIgnoreCase("true")) {
			codigo.append("ldc.i4.1/n");
		} else {
			codigo.append("ldc.i4.0/n");
		}
	}

	private void acao_12() {
		pilhaTipo.push(ETipo.BOOLEAN.toString());
		codigo.append("ldc.i4.0/n");
	}

	private void acao_13() {
		String tipo = pilhaTipo.pop();
		if (tipo.equalsIgnoreCase(ETipo.BOOLEAN.toString())) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codigo.append("ldc.i4.1/n");
			codigo.append("xor/n");
		} else {
			// senão erro semântico, halt
		}
	}

	private void acao_14() {
		String tipo = pilhaTipo.pop();
		/*
		 * if (tipo.equalsIgnoreCase(ETipo.INT.toString())) {
		 * codigo.append("call void [mscorlib]System.Console::Write(int64)/n");
		 * } else { if (tipo.equalsIgnoreCase(ETipo.FLOAT.toString())) {
		 * codigo.append
		 * ("call void [mscorlib]System.Console::Write(float64)/n"); } else { if
		 * (tipo.equalsIgnoreCase(ETipo.BOOLEAN.toString())) {
		 * codigo.append("call void [mscorlib]System.Console::Write(bool)/n"); }
		 * } }
		 */

		// Java 7 \0/
		switch (tipo) {
		case "int":
			codigo.append("call void [mscorlib]System.Console::Write(int64)/n");
			break;
		case "float":
			codigo.append("call void [mscorlib]System.Console::Write(float64)/n");
			break;
		case "boolean":
			codigo.append("call void [mscorlib]System.Console::Write(bool)/n");
			break;
		}
	}

	private void acao_24(Token token) {
		// FIXME: fazer o que com tipo? push na pilha?
		switch (token.getLexeme()) {
		case "int":
			// tipo = "int64";
			pilhaTipo.push("int64");
			break;
		case "real":
			// tipo = "float64";
			pilhaTipo.push("float64");
			break;
		}
	}

	private void acao_25(Token token) {
		lista.add(token.getLexeme());
	}

	private void acao_26() throws SemanticError {
		for (String id : lista) {
			if (tabelaSimbolo.containsKey(id)) {
				throw new SemanticError("FUUUUU!!!!");
			}
			// FIXME: tipo vem da pilha?
			String tipo = pilhaTipo.pop();
			tabelaSimbolo.put(id, tipo);
			codigo.append(".locals (" + tipo + " " + id + ")\n");
		}
	}

	private void acao_27() throws SemanticError {
		for (String id : lista) {
			if (!tabelaSimbolo.containsKey(id)) {
				throw new SemanticError("FUUUUU!!!!");
			}
			// FIXME: verificar se não é id de "programa"
			String tipo = tabelaSimbolo.get(id);
			codigo.append("call string [mscorlib]System.Console::ReadLine()\n");
			if (!tipo.equalsIgnoreCase(ETipo.STRING.toString())) {
				codigo.append("call " + tipo + " [mscorlib]System.Int64::Parse(string)\n");
				codigo.append("stloc " + id + "\n");
			}
		}
	}

	private void acao_28(Token token) throws SemanticError {
		String id = token.getLexeme();
		if (!tabelaSimbolo.containsKey(id)) {
			throw new SemanticError("FUUUUU!!!!");
		}
		// FIXME: verificar se não é id de "programa"
		pilhaTipo.push(tabelaSimbolo.get(id));
		codigo.append("ldloc " + id + "\n");
	}

	private void acao_29(Token token) throws SemanticError {
		String id = pilhaTipo.pop();
		if (!tabelaSimbolo.containsKey(id)) {
			throw new SemanticError("FUUUUU!!!!");
		}
		// FIXME: verificar se não é id de "programa"
		// tipo expressão
		String tipo1 = pilhaTipo.pop();
		// tipo do id
		String tipo2 = tabelaSimbolo.get(id);
		if (tipo1 != tipo2) {
			throw new SemanticError("FUUUUU!!!!");
		}
	}

	private void empilhaInt() {
		pilhaTipo.push(ETipo.INT.toString());
	}

	private void empilhaFloat() {
		pilhaTipo.push(ETipo.FLOAT.toString());
	}

	private boolean isFloat(String tipo) {
		return tipo.equalsIgnoreCase(ETipo.FLOAT.toString());
	}

	private boolean isInt(String tipo) {
		return tipo.equalsIgnoreCase(ETipo.INT.toString());
	}
}
