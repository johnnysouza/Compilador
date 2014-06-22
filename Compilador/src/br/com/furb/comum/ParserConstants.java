package br.com.furb.comum;

public interface ParserConstants {
	int START_SYMBOL = 43;

	int FIRST_NON_TERMINAL = 43;
	int FIRST_SEMANTIC_ACTION = 85;

	int[][] PARSER_TABLE = {
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 2, 2, -1, 2, -1, 2, 2, 2, -1,
					2, 2, 2, 2, -1, 2, -1, 1, -1, -1 },
			{ -1, 3, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 4, 3, -1, 3, -1, 4, 3, 4, -1,
					3, 3, 3, 4, -1, 4, -1, -1, -1, -1 },
			{ -1, 6, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, 6, 5, 5, -1, -1, 6, -1, -1,
					6, 6, 6, -1, -1, -1, 5, -1, -1, 5 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 7, -1, -1, -1, -1, 7, -1, 7,
					-1, -1, -1, -1, 7, -1, 7, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 8, -1, -1, -1, -1, 9, -1, 10,
					-1, -1, -1, -1, 11, -1, 12, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, 13, 14, -1, -1, -1, -1, 14, -1, 14,
					-1, -1, -1, -1, 14, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 15, -1, -1, -1, -1, 15, -1, 15,
					-1, -1, -1, -1, 15, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 18, -1, -1, -1, -1, 18, -1, 18,
					-1, -1, -1, -1, 18, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 19, -1, -1, -1, -1, 20, -1, 21,
					-1, -1, -1, -1, 22, -1, -1, -1, -1, -1, -1 },
			{ -1, 23, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, 23, -1, 23, -1, -1, 23, -1,
					-1, 23, 23, 23, -1, -1, -1, -1, -1, 24, 23 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, 27, -1, -1, -1, -1, 27, -1, 27,
					-1, -1, -1, -1, 27, -1, -1, -1, -1, -1, -1 },
			{ -1, 28, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, 32, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, 33, 34, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 37, -1, -1, -1,
					-1, -1, -1, -1, -1, 36, -1, -1, -1, -1, -1 },
			{ -1, 38, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, 42, -1, -1, -1, -1, 41, -1,
					-1, 40, 40, 39, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, 45, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 46, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, 47, 48, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 49, 49, 49, 49, 49, 49, -1, -1, -1, -1, -1, 49, -1, -1, -1,
					-1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1, 49, -1, -1, -1,
					-1, -1, -1, -1, -1, 49, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 52, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, 53, 54, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, 55, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 56, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 58, 58, 58, 58, 58, 58, -1, -1, -1, -1, -1, 58, -1, -1, -1,
					-1, -1, -1, -1, -1, 58, 57, -1, -1, -1, -1, 58, -1, -1, -1,
					-1, -1, -1, -1, -1, 58, -1, -1, -1, -1, -1 },
			{ -1, 59, 59, 59, 59, 59, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1,
					-1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1, 59, -1, -1, -1,
					-1, -1, -1, -1, -1, 59, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 17, -1, -1, 16, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, 29, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 30, 29, -1, 29, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, 51, -1, -1, 50, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 61, -1, -1, -1, -1,
					-1, -1, -1, 60, 60, -1, 60, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 68, 68, -1, 69, 69, 69,
					69, 69, 69, 68, 68, -1, 68, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, 78, 79, -1, -1, -1, 77, 77, -1, 77, 77, 77,
					77, 77, 77, 77, 77, -1, 77, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, 81, 81, 82, 83, -1, 81, 81, -1, 81, 81, 81,
					81, 81, 81, 81, 81, -1, 81, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, 91, 91, 91, 91, -1, 91, 91, -1, 91, 91, 91,
					91, 91, 91, 91, 91, 92, 91, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 63, 63, 63, 63, 63, 63, -1, -1, -1, -1, -1, 66, -1, -1, -1,
					-1, -1, -1, -1, -1, 63, -1, -1, -1, -1, -1, 65, -1, -1, -1,
					-1, -1, -1, -1, -1, 64, -1, -1, -1, -1, -1 },
			{ -1, 67, 67, 67, 67, 67, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 67, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 70, 71, 72,
					73, 74, 75, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 76, 76, 76, 76, 76, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 76, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 80, 80, 80, 80, 80, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 80, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, 84, 85, 86, 87, 89, 90, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 88, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
			{ -1, -1, -1, -1, -1, -1, -1, -1, -1, 43, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, 44, -1, -1, -1, -1, -1, -1, -1, -1, -1,
					-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 } };

	int[][] PRODUCTIONS = { { 100, 32, 44, 45, 46, 27, 101 }, { 40, 55, 44 },
			{ 0 }, { 0 }, { 47, 45 }, { 0 }, { 59, 46 },
			{ 48, 2, 22, 49, 23, 53, 46, 54, 27 }, { 24 }, { 29 }, { 31 },
			{ 36 }, { 38 }, { 0 }, { 50 }, { 51, 70 }, { 0 }, { 20, 50 },
			{ 52, 2 }, { 24 }, { 29 }, { 31 }, { 36 }, { 0 }, { 41, 55, 53 },
			{ 0 }, { 42, 69, 21 }, { 52, 109, 56, 111, 57, 21 },
			{ 2, 110, 71 }, { 0 }, { 20, 56 }, { 0 }, { 10, 58, 115 }, { 3 },
			{ 4 }, { 5 }, { 37 }, { 28 }, { 2, 84 }, { 61 }, { 62 }, { 64 },
			{ 66 }, { 60 }, { 67 }, { 110, 10, 69, 114, 21 },
			{ 35, 22, 56, 112, 23, 21 }, { 33, 22, 63, 23, 21 },
			{ 34, 22, 63, 102, 23, 21 }, { 69, 99, 72 }, { 0 }, { 20, 63 },
			{ 30, 22, 69, 23, 116, 46, 65, 27, 117, 21 }, { 26, 118, 46 },
			{ 0 }, { 25, 119, 46, 39, 22, 69, 23, 120, 21 },
			{ 22, 68, 23, 21 }, { 0 }, { 63 }, { 78, 73 }, { 0 },
			{ 12, 78, 103, 73 }, { 11, 78, 104, 73 }, { 79 }, { 37, 96 },
			{ 28, 97 }, { 13, 78, 98 }, { 81, 74 }, { 0 },
			{ 80, 105, 81, 106 }, { 14 }, { 15 }, { 16 }, { 17 }, { 18 },
			{ 19 }, { 82, 75 }, { 0 }, { 6, 82, 86, 75 }, { 7, 82, 87, 75 },
			{ 83, 76 }, { 0 }, { 8, 83, 88, 76 }, { 9, 83, 89, 76 },
			{ 2, 113, 77 }, { 3, 90 }, { 4, 91 }, { 5, 107 }, { 22, 69, 23 },
			{ 6, 83, 108 }, { 7, 83, 92 }, { 0 }, { 22, 63, 23 } };

	String[] PARSER_ERROR = { "", "esperado fim de programa", //Era esperado fim de programa
			"esperado identificador", //Era esperado identificador
			"esperado constante inteira", //Era esperado constanteInteira
			"esperado constante float", //Era esperado constanteFloat
			"esperado constante string", //Era esperado constanteString
			"esperado '+'", //Era esperado \"+\"
			"esperado '-'", //Era esperado \"-\"
			"esperado '*'", //Era esperado \"*\"
			"esperado '/'", //Era esperado \"/\"
			"esperado '='", //Era esperado \"=\"
			"esperado \"&&\"", //Era esperado \"&&\"
			"esperado \"||\"", //Era esperado \"||\"
			"esperado '!'", //Era esperado \"!\"
			"esperado \"==\"", //Era esperado \"==\"
			"esperado \"!=\"", //Era esperado \"!=\"
			"esperado '<'", //Era esperado \"<\"
			"esperado \"<=\"", //Era esperado \"<=\"
			"esperado '>'", //Era esperado \">\"
			"esperado \">=\"", //Era esperado \">=\"
			"esperado ','", //Era esperado \",\"
			"esperado ';'", //Era esperado \";\"
			"esperado '('", //Era esperado \"(\"
			"esperado ')'", //Era esperado \")\"
			"esperado boolean", //Era esperado pr_boolean
			"esperado do", //Era esperado pr_do
			"esperado else", //Era esperado pr_else
			"esperado end", //Era esperado pr_end
			"esperado false", //Era esperado pr_false
			"esperado float", //Era esperado pr_float
			"esperado if", //Era esperado pr_if
			"esperado integer", //Era esperado pr_integer
			"esperado main", //Era esperado pr_main
			"esperado print", //Era esperado pr_print
			"esperado println", //Era esperado pr_println
			"esperado scan", //Era esperado pr_scan
			"esperado string", //Era esperado pr_string
			"esperado true", //Era esperado pr_true
			"esperado void", //Era esperado pr_void
			"esperado while", //Era esperado pr_while
			"esperado global", //Era esperado pr_global
			"esperado local", //Era esperado pr_local
			"esperado return", //Era esperado pr_return
			"esperado main", //<main> inválido
			"esperado identificador, boolean, do, end, float, if, integer, print, println, scan, string, void, global", //<variaveis_globais> inválido
			"esperado identificador, boolean, do, end, float, if, integer, print, println, scan, string, void", //<lista_modulos> inválido
			"esperado identificador, do, else, end, if, print, println, scan, while, return", //<lista_comandos> inválido
			"esperado boolean, float, integer, string, void", //<modulo> inválido
			"esperado boolean, float, integer, string, void", //<tipo_modulo> inválido
			"esperado ')', boolean, float, integer, string", //<parametros> inválido
			"esperado boolean, float, integer, string", //<lista_parametros> inválido
			"esperado boolean, float, integer, string", //<parametro> inválido
			"esperado boolean, float, integer, string", //<tipo> inválido
			"esperado identificador, do, end, if, print, println, scan, local, return", //<variaveis_locais> inválido
			"esperado end, return", //<retorno> inválido
			"esperado boolean, float, integer, string", //<variaveis> inválido
			"esperado identificador", //<lista_identificadores> inválido
			"esperado '=', ';'", //<valor> inválido
			"esperado constante inteira, constante float, constante String, false, true", //<constante> inválido
			"esperado identificador, do, if, print, println, scan", //<comando> inválido
			"esperado '='", //<cmd_atribuicao> inválido
			"esperado scan", //<cmd_entrada> inválido
			"esperado print, println", //<cmd_saida> inválido
			"esperado expressao", //<lista_expressoes> inválido
			"esperado if", //<cmd_selecao> inválido
			"esperado else, end", //<else> inválido
			"esperado do", //<cmd_repeticao> inválido
			"esperado '('", //<cmd_chamada_modulo> inválido
			"esperado identificador, constante inteira, constante float, constante String, '+', '-', '!', '(', ')', false, true", //<parametros_reais> inválido
			"esperado expressao", //<expressao> inválido
			"esperado ',', ')'", //<lista_parametros_1> inválido
			"esperado '=', ',', ';', ')'", //<lista_identificadores_1> inválido
			"esperado ',', ')'", //<lista_expressoes_1> inválido
			"esperado expressao", //<expressao_1>
			"esperado expressao", //<relacional_1>
			"esperado expressao", //<aritmetica_1>
			"esperado expressao", //<termo_1>
			"esperado expressao", //<identificador_1>
			"esperado expressao", //<elemento>
			"esperado expressao", //<relacional>
			"esperado expressao", //<operador_relacional>
			"esperado expressao", //<aritmetica>
			"esperado expressao", //<termo>
			"esperado expressao", //<fator>
			"esperado '=', '('" //<comando_1> inválido
			};
}
