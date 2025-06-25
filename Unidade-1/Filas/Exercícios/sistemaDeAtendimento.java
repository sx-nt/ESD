//Uma loja automotiva implantou um programa para organizar a fila de atendimento de clientes.
// Cada cliente que chega na loja se apresenta a um atendente,
// que inclui seu nome em uma fila e lhe informa quantos clientes estão na sua frente.
// Os clientes são atendidos por ordem de chegada. Os atendimentos são feitos por uma equipe de profissionais,
// e sempre que um dos membros dessa equipe fica ocioso, ele obtém da fila de espera o nome do próximo cliente.
//
//Escreva um programa que funcione como esse sistema de atendimento da loja. Para simplificar,
// seu programa deve implementar um laço que executa repetidamente o seguinte:
//
//O programa deve apresentar este prompt: ">"
//Se for digitado o caractere "?", o programa deve apresentar o nome do próximo cliente (caso exista), e retirá-lo da fila
//Se for digitado o comando "sair" o programa deve terminar
//Se for digitado um nome de cliente, ele deve adicioná-lo à fila, e apresentar na tela quantos
// clientes estão na sua frente


//while com Switch case
//Sout >
//Menu ? If com proximo cliente (se existir apresenta o nome 'inicio' e remove
         //Se não diz que não tem mais
//sair
//nome cliente --> adiciona() a fila e apresenta clientes a frente
import esd.Fila;
import java.util.Scanner;

public class sistemaDeAtendimento {

    public static void main(String[] args) {
        Fila<String> filaAtendimento = new Fila<>();
        filaAtendimento.adiciona("maria claudia");
        filaAtendimento.adiciona("carlos");


        boolean andamento = true;

        System.out.println(
                        "+---------------------------------------------+\n" +
                        "|             Sistema de Atendimento          |\n" +
                        "+---------------------------------------------+\n" +
                        "| ?    - Próximo cliente                      |\n" +
                        "| sair - Encerrar o programa                  |\n" +
                        "| <nome do cliente> - Adicionar cliente       |\n" +
                        "|                                             |\n" +
                        "+---------------------------------------------+"
        );


        while (andamento) {
            System.out.println(">");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase();

            switch (input) {
               case "?":
                   String prox = filaAtendimento.frente();
                   if(prox == null){
                       System.out.println("Não há próximo cliente");
                   } else {
                       System.out.println("Próximo Cliente: " + prox);
                       filaAtendimento.remove();
                   }
                   break;
               case "sair":
                   andamento = false;
                   break;
               default:
                   System.out.println("Clientes a frente: " + filaAtendimento.comprimento());
                   filaAtendimento.adiciona(input);
                   break;
           }
       }
    }
}