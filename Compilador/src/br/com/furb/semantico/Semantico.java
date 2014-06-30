package br.com.furb.semantico;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import br.com.furb.comum.Constants;
import br.com.furb.comum.Token;
import br.com.furb.enumeracao.ETipo;

public class Semantico implements Constants {
	private StringBuilder codigo;
	private Stack<String> pilhaTipo;
	private Map<String, String> tabelaSimbolo;
	private List<String> listaIdentificadores;
	private String nomeArquivo;
	private String operadorRelacional;

	public Semantico(String nomeArquivo) {
		this.codigo = new StringBuilder();
		this.pilhaTipo = new Stack<String>();
		this.tabelaSimbolo = new HashMap<String, String>();
		this.listaIdentificadores = new ArrayList<String>();
		this.nomeArquivo = nomeArquivo;
		operadorRelacional = "";
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
		case 15:
			acao_15();
			break;
		case 16:
			acao_16();
			break;
		case 17:
			acao_17();
			break;
		case 18:
			acao_18();
			break;
		case 19:
			acao_19();
			break;
		case 20:
			acao_20(token);
			break;
		case 21:
			acao_21();
			break;
		case 22:
			acao_22(token);
			break;
		case 23:
			acao_23();
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
		case 30:
			acao_30();
			break;
		case 31:
			acao_31();
			break;
		case 32:
			acao_32();
			break;
		case 33:
			acao_33();
			break;
		case 34:
			acao_34();
			break;
		case 35:
			acao_35();
			break;
		}

	}

	private void acao_01() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (isFloat(tipo1) || isFloat(tipo2)) {
			empilhaFloat();
		} else {
			empilhaInt();
		}

		codeAppend("add");

	}

	private void acao_02() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (isFloat(tipo1) || isFloat(tipo2)) {
			empilhaFloat();
		} else {
			empilhaInt();
		}

		codeAppend("sub");
	}

	private void acao_03() {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (isFloat(tipo1) || isFloat(tipo2)) {
			empilhaFloat();
		} else {
			empilhaInt();
		}

		codeAppend("mul");
	}

	private void acao_04() throws SemanticError {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(tipo1);
			codeAppend("div");
		} else {
			throw new SemanticError("Tipos incompatíves para divisão");
		}
	}

	private void acao_05(Token token) {
		empilhaInt();
		codeAppend("ldc.i8 " + token.getLexeme());
	}

	private void acao_06(Token token) {
		empilhaFloat();
		codeAppend("ldc.r8 " + token.getLexeme());
	}

	private void acao_07() throws SemanticError {
		String tipo = pilhaTipo.peek();

		if (isInt(tipo) || isFloat(tipo)) {
			codeAppend("ldc.i8 -1");
			codeAppend("mul");
		} else {
			throw new SemanticError("Tipo incompatível para operação de inversão de sinal");
		}
	}

	private void acao_08() throws SemanticError {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codeAppend("clt");
		} else {
			throw new SemanticError(
					"Tipos incompatíves para relação \"menor que\" (<)");
		}

	}

	private void acao_09() throws SemanticError {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codeAppend("cgt");
		} else {
			throw new SemanticError(
					"Tipos incompatíves para relação \"maior que\" (>)");
		}
	}

	private void acao_10() throws SemanticError {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1.equalsIgnoreCase(tipo2)) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codeAppend("ceq");
		} else {
			throw new SemanticError(
					"Tipos incompatíves para relação \"igual a\" (=)");
		}
	}

	private void acao_11(Token token) {
		pilhaTipo.push(ETipo.BOOLEAN.toString());
		codeAppend("ldc.i4.1");
	}

	private void acao_12() {
		pilhaTipo.push(ETipo.BOOLEAN.toString());
		codeAppend("ldc.i4.0");
	}

	private void acao_13() throws SemanticError {
		String tipo = pilhaTipo.pop();
		if (tipo.equalsIgnoreCase(ETipo.BOOLEAN.toString())) {
			pilhaTipo.push(ETipo.BOOLEAN.toString());
			codeAppend("ldc.i4.1");
			codeAppend("xor");
		} else {
			throw new SemanticError(
					"Tipo incompatível para operação lógica not, esperado tipo boolean");
		}
	}

	private void acao_14() {
		String tipo = pilhaTipo.pop();

		switch (tipo) {
		case "int64":
			codeAppend("call void [mscorlib]System.Console::Write("
					+ ETipo.INT.getTipoMSIL() + ")");
			break;
		case "float64":
			codeAppend("call void [mscorlib]System.Console::Write("
					+ ETipo.FLOAT.getTipoMSIL() + ")");
			break;
		case "bool":
			codeAppend("call void [mscorlib]System.Console::Write("
					+ ETipo.BOOLEAN.getTipoMSIL() + ")");
			break;
		case "string":
			codeAppend("call void [mscorlib]System.Console::Write("
					+ ETipo.STRING.getTipoMSIL() + ")");
			break;
		}

		codeAppend();
	}

	/**
	 * Início do programa.
	 */
	private void acao_15() {
		codeAppend(".assembly extern mscorlib{}");
		codeAppend(".assembly " + nomeArquivo + "{}");
		codeAppend(".module " + nomeArquivo + ".exe");
		codeAppend("");
		codeAppend(".class public " + nomeArquivo + " {");
		codeAppend(".method static public void _principal()");
		codeAppend("{");
		codeAppend(".entrypoint");
	}

	/**
	 * Fim do programa.
	 */
	private void acao_16() {
		codeAppend("ret");
		codeAppend("}");
		codeAppend("}");
	}

	private void acao_17() {
		codeAppend("ldstr " + '\"' + "\\n" + '\"');
		codeAppend("call void [mscorlib]System.Console::Write("
				+ ETipo.STRING.getTipoMSIL() + ")");
		codeAppend();
	}

	private void acao_18() {
		codeAppend("or");
	}

	private void acao_19() {
		codeAppend("and");
	}

	private void acao_20(Token token) {
		operadorRelacional = token.getLexeme().trim();
	}

	private void acao_21() throws SemanticError {
		String tipo1 = pilhaTipo.pop();
		String tipo2 = pilhaTipo.pop();

		if (tipo1 == tipo2) {
			switch (operadorRelacional) {
			case "==":
				codeAppend("ceq");
				break;
			case "!=":
				codeAppend("ceq");
				codeAppend("ldc.i4.1");
				codeAppend("xor");
				break;
			case "<":
				codeAppend("clt");
				break;
			case "<=":
				codeAppend("cgt");
				codeAppend("ldc.i4.0");
				codeAppend("ceq");
				break;
			case ">":
				codeAppend("cgt");
				break;
			case ">=":
				codeAppend("clt");
				codeAppend("ldc.i4.0");
				codeAppend("ceq");
				break;
			default:
				throw new SemanticError("Operador relacional inválido");
			}
			pilhaTipo.push(ETipo.BOOLEAN.getTipoMSIL());
		} else {
			throw new SemanticError("Tipos incompatíveis para operação relacional");
		}
	}

	private void acao_22(Token token) {
		pilhaTipo.push(ETipo.STRING.getTipoMSIL());
		codeAppend("ldstr " + token.getLexeme());
	}

	private void acao_23() throws SemanticError {
		String tipo = pilhaTipo.peek();

		if (!(isInt(tipo) || isFloat(tipo))) {
			throw new SemanticError("Tipo incompatível para operação de sinal");
		}
	}

	private void acao_24(Token token) {
		switch (token.getLexeme()) {
		case "integer":
			pilhaTipo.push(ETipo.INT.getTipoMSIL());
			break;
		case "real":
			pilhaTipo.push(ETipo.FLOAT.getTipoMSIL());
			break;
		case "string":
			pilhaTipo.push(ETipo.STRING.getTipoMSIL());
			break;
		case "boolean":
			pilhaTipo.push(ETipo.BOOLEAN.getTipoMSIL());
			break;
		}
	}

	private void acao_25(Token token) {
		listaIdentificadores.add(token.getLexeme());
	}

	private void acao_26() throws SemanticError {
		String tipo = pilhaTipo.pop();
		for (String id : listaIdentificadores) {
			if (tabelaSimbolo.containsKey(id)) {
				throw new SemanticError("Identificador " + id + " já foi declarado");
			}
			tabelaSimbolo.put(id, tipo);
			codeAppend(".locals (" + tipo + " " + id + ")");
			codeAppend();
		}
	}

	private void acao_27() throws SemanticError {
		for (String id : listaIdentificadores) {
			if (!tabelaSimbolo.containsKey(id)) {
				throw new SemanticError("Identificador " + id + " não declarado");
			}
			
			// FIXME: verificar se não é id de "programa", falta verificar se é isso mesmo
			if (id.equalsIgnoreCase(nomeArquivo)) {
				throw new SemanticError(""); //TODO verificar mensagem adequada
			}

			String tipo = tabelaSimbolo.get(id);
			codeAppend("call string [mscorlib]System.Console::ReadLine()");
			if (!tipo.equalsIgnoreCase(ETipo.STRING.toString())) {
				codeAppend("call " + tipo
						+ " [mscorlib]System.Int64::Parse(string)");
				codeAppend("stloc " + id);
				codeAppend();
			}
		}
	}

	private void acao_28(Token token) throws SemanticError {
		String id = token.getLexeme();
		if (!tabelaSimbolo.containsKey(id)) {
			throw new SemanticError("Identificador " + id + " não declarado");
		}

		// FIXME: verificar se não é id de "programa", falta verificar se é isso mesmo
		if (id.equalsIgnoreCase(nomeArquivo)) {
			throw new SemanticError(""); //TODO verificar mensagem adequada
		}

		pilhaTipo.push(tabelaSimbolo.get(id));
		codeAppend("ldloc " + id);
	}

	private void acao_29(Token token) throws SemanticError {
		String id = listaIdentificadores.get(listaIdentificadores.size() - 1);
		if (!tabelaSimbolo.containsKey(id)) {
			throw new SemanticError("FUUUUU!!!!");
		}

		// FIXME: verificar se não é id de "programa", falta verificar se é isso mesmo
		if (id.equalsIgnoreCase(nomeArquivo)) {
			throw new SemanticError(""); //TODO verificar mensagem adequada
		}

		// tipo expressão
		String tipo1 = pilhaTipo.pop();
		// tipo do id
		String tipo2 = tabelaSimbolo.get(id);
		if (tipo1 != tipo2) {
			throw new SemanticError("FUUUUU!!!!");
		}
		codeAppend("stloc " + id);
		codeAppend();
	}

	private void acao_30() {
		// TODO implementar
	}

	private void acao_31() {
		// TODO implementar
	}

	private void acao_32() {
		// TODO implementar
	}

	private void acao_33() {
		// TODO implementar
	}

	private void acao_34() {
		// TODO implementar
	}

	private void acao_35() {
		// TODO implementar
	}

	private void empilhaInt() {
		pilhaTipo.push(ETipo.INT.getTipoMSIL());
	}

	private void empilhaFloat() {
		pilhaTipo.push(ETipo.FLOAT.getTipoMSIL());
	}

	private boolean isFloat(String tipo) {
		return tipo.equalsIgnoreCase(ETipo.FLOAT.toString());
	}

	private boolean isInt(String tipo) {
		return tipo.equalsIgnoreCase(ETipo.INT.toString());
	}

	/**
	 * Adiciona a quebra de linha no final do código.
	 * 
	 * @param code
	 *            Código para .NET
	 */
	private void codeAppend(String code) {
		codigo.append(code);
		codigo.append("\n");
	}

	/**
	 * Adiciona a quebra de linha.
	 */
	private void codeAppend() {
		codigo.append("\n");
	}

	public StringBuilder getCodigo() {
		return codigo;
	}
}
