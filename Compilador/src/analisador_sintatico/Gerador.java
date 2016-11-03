package analisador_sintatico;

import java.io.File;

public class Gerador {
    public static void main(String[] args) {
        //Criação de objeto do arquivo com regras de produção para análise
        File file = new File("F:/Compilador/src/analisador_sintatico/Regras.flex");
        
        /*Chamada da classe Main na biblioteca JFlex passando o arquivo criado anteriormente,
            para criação da classe Java responsavel pela análise Léxica.*/
        JFlex.Main.generate(file);
    }
}