# Compilador_v2
A PASTA DE NOME "COMPILADOR" É UM PROJETO DO NETBEANS. O .JAR SE ENCONTRA NA PASTA DE NOME "EXECUTAVEL"
Segunda parte da implementação de um Compilador simples. Inclusão do analisador sintático.

Centro Universitário de Brasília - UniCEUB

Construção de Compiladores - 6º Período - Professor Eduardo Santos

Aluno / Usuário no GitHub:

Álvaro Veiga / tiovo

Felipe Alves / Lipoink

Lucas Cardoso / lccherigath


Construção de Analisador Léxico e Analisador Sintático para disciplina de Construção de Compiladores como projeto final.

# FUNCIONAMENTO

O analisador Sintático proposto foi desenvolvido utilizando a biblioteca JavaCup integrada com a biblioteca JFlex para auxilio nas funcionalidades desejadas.

Primeiro passo - alteração e adaptação do arquivo Regras.flex (já feito para o analisador léxico) para se integrar e comunicar com o JavaCup.

Segundo passo - execução da classe "Gerador.java" para criar automaticamente a classe "Yylex.java" a partir do "Regras.flex".

Terceiro passo - criação de arquivo "Parser.cup" com as regras e especificações da gramática e derivações a serem analisadas sintaticamente.

Quarto passo - compilação do arquivo de regras "Parser.cup" pelo prompt de comando usando o comando "java java_cup.Main parser.cup" para gerar automaticamente as classes responsaveis pela analise sintatica, as classes "parser.java" e "sym.java".

Quinto passo - foi criada a classe principal que recebe o nome de “Executa.java”. Nela foi implementado uma interface simples e de fácil manuseio para realização da análise sintatica proposta. Junto com a interface há os tratamentos de eventos e métodos que passam o código digitado para um objeto da classe “parser.java” e trata as informações retornadas como resultado da análise sintatica.

Sexto passo - foi criada a classe principal geral do sistema, que recebe o nome de "tela_principal.java" localizada no pacote "tela_principal". Ela tem a função de unir os dois programas feitos até agora, a parte de análise léxica e a análise sintática. Chamando as respectivas classes principais (interfaces) de cada analisador.

# ENTRADA e EXEMPLO

O compilador é baseado em Java e analisa if, while, for, try, catch, finally que podem ser usados um dentro do outro e intercalados com operações lógicas, aritméticas e de atribuição.

O código abaixo é um exemplo correto que usa todas as funções do analisador, sinta-se à vontade para fazer modificações com erros propositais para testar o analisador sintático.

float a=2;
int x=0;        
if (a == 2) {
        } else {
        }
        try {
            while (true) {
                x = 1;
                a = 2;
            }
            if (false) {
                try {
                    a = 2;
                } catch (Exception a) {
                    for(x=10; x<50;x--){
                        if(x>10){}
                    }
                } finally {
                    for (int i = 0; i < 10; i++) {

                    }
                }
            }
        } catch (Exception a) {
            if (x < 2) {
                x = 2;
            }
        }
