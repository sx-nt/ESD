/**
 * Leia corretamente 10 números do arquivo (numeros.txt)
 *
 * Empilhe números pares;
 *
 * Desempilhe (se possível) números ímpares;
 *
 * Ao final, desempilhe e imprima todos os elementos restantes da pilha.
 */


package esd.Exercícios;
import esd.Pilha;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {

        File linhas = new File(args[0]);
        Scanner leitor = new Scanner(linhas);

        Pilha pilha = new Pilha<>();

        int contador = 0;

        while (leitor.hasNextInt() && contador < 10) {
            int numero = leitor.nextInt();
            contador++;

            if (numero % 2 == 0) {
                pilha.empilha(numero);
            } else {
                if (!pilha.estaVazia()) {
                    pilha.desempilha();
                }
            }
            while(!pilha.estaVazia()){
                System.out.println(pilha.desempilha());
            }
        }
    }
}
