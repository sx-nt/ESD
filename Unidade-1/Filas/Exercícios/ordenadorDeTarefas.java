package esd.Exercícios;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Um arquivo contém uma listagem das tarefas de um projeto,
// as quais possuem uma prioridade. Cada linha desse arquivo se apresenta desta forma:
//
//prioridade: tarefa
//Por exemplo:
//
//4: documentar o subsistema A
//1: entrevistar o cliente
//2: modelar o subsistema B
//2: modelar o subsistema A
//1: identificar os requisitos do subsistema A
//3: implementar o subsistema A
//2: implementar o subsistema B
//
//Escreva um programa que leia um arquivo desses e apresente as tarefas ordenadas por suas prioridades
// (valores menores significam maiores prioridades).
// O nome do arquivo é informado no primeiro argumento de linha de comando.
// No exemplo acima, o resultado seria este:
//
//1: entrevistar o cliente
//1: identificar os requisitos do subsistema A
//2: modelar o subsistema B
//2: modelar o subsistema A
//2: implementar o subsistema B
//3: implementar o subsistema A
//4: documentar o subsistema A
//Observe que as tarefas de mesma prioridade devem estar na mesma ordem que no arquivo original.
//
//Sabendo que existem, no máximo, 5 níveis de prioridade (de 1 até 5),
// implemente o programa que faz esse ordenamento.
//
//DICA: você pode usar mais de uma fila !

//File reader pra ler o arquivo por linha cada linha faz split 1: ou pega integer
//checa prioridade e coloca a respectiva tarefa na fila

import esd.Fila;

public class ordenadorDeTarefas {
    public static void main(String[] args) throws FileNotFoundException {

        Fila<String> P1 = new Fila<>();
        Fila<String> P2 = new Fila<>();
        Fila<String> P3 = new Fila<>();
        Fila<String> P4 = new Fila<>();
        Fila<String> P5 = new Fila<>();


        File linhas = new File(args[0]);
        Scanner leitor = new Scanner(linhas);

        while(leitor.hasNextLine()){
            String texto = leitor.nextLine();
            if (texto.isEmpty()) continue;

            String[] partes = texto.split(":", 2);

            String prioridade = partes[0].trim();
            String tarefa = partes[1].trim();

            switch (prioridade){
                case "1" :
                    P1.adiciona("1: " + tarefa);
                    break;
                case "2" :
                    P2.adiciona("2: " + tarefa);
                    break;
                case "3" :
                    P3.adiciona("3: " + tarefa);
                    break;
                case "4" :
                    P4.adiciona("4: " + tarefa);
                    break;
                case "5" :
                    P5.adiciona("5: " + tarefa);
                    break;
                default:
                    System.out.println("Prioridade inválida");
            }
        }
        leitor.close();

        while (!P1.estaVazia()) System.out.println(P1.remove());
        while (!P2.estaVazia()) System.out.println(P2.remove());
        while (!P3.estaVazia()) System.out.println(P3.remove());
        while (!P4.estaVazia()) System.out.println(P4.remove());
        while (!P5.estaVazia()) System.out.println(P5.remove());
    }
}
