package analisador_lexico;

import static analisador_lexico.Tokens.*;

%%
%class Lexemas
%type Tokens

LETRA = [a-zA-Z_]
DIGITO = [0-9]
RESERVADO_NULL = "null"
RESERVADO_IF = "if"
RESERVADO_WHILE = "while"
RESERVADO_TRY = "try"
RESERVADO_CATCH = "catch"
RESERVADO_FINALLY = "finally"
RESERVADO_ELSE = "else"
RESERVADO_FOR = "for"
EXCECAO = ("ArithmeticException" | "ArrayIndexOutOfBoundsException" | "ArrayStoreException" | "ClassCastException" | "IllegalArgumentException" | 
"IllegalMonitorStateException" | "IllegalStateException" | "IllegalThreadStateException" | "IndexOutOfBoundsException" | "NegativeArraySizeException" |
 "NullPointerException" | "NumberFormatException" | "SecurityException" | "StringIndexOutOfBounds" | "UnsupportedOperationException" | "ClassNotFoundException"| 
"CloneNotSupportedException" | "IllegalAccessException" | "InstantiationException" | "InterruptedException" | "NoSuchFieldException" | "NoSuchMethodException" |
"Exception")
TIPO = ("boolean" | "enum" | "char"| "String")
TIPO_NUMERICO = ("int" | "float" | "double")
OPERADOR_ARITMETICO = ("+" | "-" | "*" | "/" | "%")
OPERADOR_ATRIBUICAO = ("+=" | "-="  | "*=" | "/=" | "%=")
OPERADOR_AUTO_INCREMENTO = ("++" | "--")
OPERADOR_ATRIBUICAO_IGUAL = "="
OPERADOR_RELACIONAL = (">" | "<" | ">=" | "<=" | "<<" | ">>")
OPERADOR_RELACIONAL_IGUAL_DIFERENTE = ("==" | "!=")
OPERADOR_LOGICO = ("&&" | "||" | "!" | "&" | "|")
OPERADOR_BOOLEANO = ("true" | "false")
SEPARADOR_PARENTESE_ABRE = "("
SEPARADOR_PARENTESE_FECHA = ")"
SEPARADOR_CHAVE_ABRE = "{"
SEPARADOR_CHAVE_FECHA = "}"
SEPARADOR_PONTO_VIRGULA = ";"
ESPACO = [ \t\r\n]
ASPAS = ("\"" | "'")

%{
public String lexema;
%}
%%

{RESERVADO_NULL} {lexema = yytext(); return RESERVADO;}
{RESERVADO_IF} {lexema = yytext(); return RESERVADO;}
{RESERVADO_WHILE} {lexema = yytext(); return RESERVADO;}
{RESERVADO_TRY} {lexema = yytext(); return RESERVADO;}
{RESERVADO_CATCH} {lexema = yytext(); return RESERVADO;}
{RESERVADO_FINALLY} {lexema = yytext(); return RESERVADO;}
{RESERVADO_ELSE} {lexema = yytext(); return RESERVADO;}
{RESERVADO_FOR} {lexema = yytext(); return RESERVADO;}
{EXCECAO} {lexema = yytext(); return EXCECAO;}
{TIPO} {lexema = yytext(); return TIPO;}
{TIPO_NUMERICO} {lexema = yytext(); return TIPO;}
{OPERADOR_ARITMETICO} {lexema = yytext(); return OPERADOR_ARITMETICO;}
{OPERADOR_ATRIBUICAO} {lexema = yytext(); return OPERADOR_ATRIBUICAO;}
{OPERADOR_ATRIBUICAO_IGUAL} {lexema = yytext(); return OPERADOR_ATRIBUICAO;}
{OPERADOR_AUTO_INCREMENTO} {lexema = yytext(); return OPERADOR_ATRIBUICAO;}
{OPERADOR_RELACIONAL} {lexema = yytext(); return OPERADOR_RELACIONAL;}
{OPERADOR_RELACIONAL_IGUAL_DIFERENTE} {lexema = yytext(); return OPERADOR_RELACIONAL;}
{OPERADOR_LOGICO} {lexema = yytext(); return OPERADOR_LOGICO;}
{OPERADOR_BOOLEANO} {lexema = yytext(); return OPERADOR_BOOLEANO;}
{SEPARADOR_PARENTESE_ABRE} {lexema = yytext(); return SEPARADOR;}
{SEPARADOR_PARENTESE_FECHA} {lexema = yytext(); return SEPARADOR;}
{SEPARADOR_CHAVE_ABRE} {lexema = yytext(); return SEPARADOR;}
{SEPARADOR_CHAVE_FECHA} {lexema = yytext(); return SEPARADOR;}
{SEPARADOR_PONTO_VIRGULA} {lexema = yytext(); return SEPARADOR;}
{ESPACO} {}
{ASPAS} {lexema = yytext(); return ASPAS;}
{LETRA}({LETRA}|{DIGITO})* {lexema=yytext(); return ID;}
("(-"{DIGITO}+")")|{DIGITO}+ {lexema=yytext(); return NUMERO;}

. {return ERROR;}