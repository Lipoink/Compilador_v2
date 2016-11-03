package analisador_sintatico;

import java_cup.runtime.Symbol;
import analisador_sintatico.sym;

%%

%cup
%full
%line
%char
%ignorecase
%eofval{
    return new Symbol(sym.EOF, new String("Fim do arquivo"));
%eofval}

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

%%

{RESERVADO_NULL} {return new Symbol (sym.RESERVADO_NULL, yychar, yyline, yytext());}
{RESERVADO_IF} {return new Symbol (sym.RESERVADO_IF, yychar, yyline, yytext());}
{RESERVADO_WHILE} {return new Symbol (sym.RESERVADO_WHILE, yychar, yyline, yytext());}
{RESERVADO_TRY} {return new Symbol (sym.RESERVADO_TRY, yychar, yyline, yytext());}
{RESERVADO_CATCH} {return new Symbol (sym.RESERVADO_CATCH, yychar, yyline, yytext());}
{RESERVADO_FINALLY} {return new Symbol (sym.RESERVADO_FINALLY, yychar, yyline, yytext());}
{RESERVADO_ELSE} {return new Symbol (sym.RESERVADO_ELSE, yychar, yyline, yytext());}
{RESERVADO_FOR} {return new Symbol (sym.RESERVADO_FOR, yychar, yyline, yytext());}
{EXCECAO} {return new Symbol (sym.EXCECAO, yychar, yyline, yytext());}
{TIPO} {return new Symbol (sym.TIPO, yychar, yyline, yytext());}
{TIPO_NUMERICO} {return new Symbol (sym.TIPO_NUMERICO, yychar, yyline, yytext());}
{OPERADOR_ARITMETICO} {return new Symbol (sym.OPERADOR_ARITMETICO, yychar, yyline, yytext());}
{OPERADOR_ATRIBUICAO} {return new Symbol (sym.OPERADOR_ATRIBUICAO, yychar, yyline, yytext());}
{OPERADOR_ATRIBUICAO_IGUAL} {return new Symbol (sym.OPERADOR_ATRIBUICAO_IGUAL, yychar, yyline, yytext());}
{OPERADOR_AUTO_INCREMENTO} {return new Symbol (sym.OPERADOR_AUTO_INCREMENTO, yychar, yyline, yytext());}
{OPERADOR_RELACIONAL} {return new Symbol (sym.OPERADOR_RELACIONAL, yychar, yyline, yytext());}
{OPERADOR_RELACIONAL_IGUAL_DIFERENTE} {return new Symbol (sym.OPERADOR_RELACIONAL_IGUAL_DIFERENTE, yychar, yyline, yytext());}
{OPERADOR_LOGICO} {return new Symbol (sym.OPERADOR_LOGICO, yychar, yyline, yytext());}
{OPERADOR_BOOLEANO} {return new Symbol (sym.OPERADOR_BOOLEANO, yychar, yyline, yytext());}
{SEPARADOR_PARENTESE_ABRE} {return new Symbol (sym.SEPARADOR_PARENTESE_ABRE, yychar, yyline, yytext());}
{SEPARADOR_PARENTESE_FECHA} {return new Symbol (sym.SEPARADOR_PARENTESE_FECHA, yychar, yyline, yytext());}
{SEPARADOR_CHAVE_ABRE} {return new Symbol (sym.SEPARADOR_CHAVE_ABRE, yychar, yyline, yytext());}
{SEPARADOR_CHAVE_FECHA} {return new Symbol (sym.SEPARADOR_CHAVE_FECHA, yychar, yyline, yytext());}
{SEPARADOR_PONTO_VIRGULA} {return new Symbol (sym.SEPARADOR_PONTO_VIRGULA, yychar, yyline, yytext());}
{ESPACO} {}
{ASPAS} {return new Symbol (sym.ASPAS, yychar, yyline, yytext());}
{LETRA}({LETRA}|{DIGITO})* {return new Symbol (sym.ID, yychar, yyline, yytext());}
("(-"{DIGITO}+")")|{DIGITO}+ {return new Symbol (sym.NUMERO, yychar, yyline, new Integer(yytext()));}

. {return new Symbol (sym.ERROR, yychar, yyline, yytext());}