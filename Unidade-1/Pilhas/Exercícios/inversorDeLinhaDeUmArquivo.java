package esd.Exercícios;

import esd.Pilha;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;



/**
 * Escreva um programa que leia linhas de um arquivo,
 * e mostre-as em ordem inversa em que foram lidas.
 * O nome do arquivo é informado como primeiro argumento de linha de comando.
 * Se o arquivo não existir, ou não puder ser lido,
 * seu programa deve apresentar esta mensagem na tela:
 *
 * arquivo invalido
 * Se o arquivo estiver vazio, seu programa deve terminar
 * sem apresentar qualquer resultado na tela.
 */

public class inversorDeLinhaDeUmArquivo {

    public static void main(String[] args) throws FileNotFoundException {

        if(args.length == 0){
            System.out.println("Arquivo invalido");
            return;
        }

        File arquivo = new File(args[0]);
        Scanner linhas = new Scanner(arquivo);

        Pilha<String> linhasInvert = new Pilha<>();

        if (linhas == null) {
            System.out.println("Arquivo vazio");
            return;
        }

        while(linhas.hasNextLine()){
            String linha = linhas.nextLine();
            linhasInvert.empilha(linha);
        }

        while (!linhasInvert.estaVazia()){
            System.out.println(linhasInvert.desempilha());
        }
    }
}
