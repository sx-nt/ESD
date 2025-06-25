//Notação polonesa inversa é uma forma de apresentação de expressões aritméticas em que o operador sucede os operandos. Por exemplo, a expressão 2 + 1 é escrita 2 1 + em notação polonesa. Essa forma de escrever expressões elimina a necessidade de uso de parênteses, uma vez que a ordem em que a expressão é resolvida está diretamente representada na própria expressão.
//        Nesta tarefa, você deve implementar uma calculadora capaz de resolver expressões aritméticas em notação polonesa como estas:
//
//        1 2 + .. .que equivale a 1 + 2
//        1 2 + 3 * ... que equivale a (1 + 2) * 3
//        1 2 + 3  4 + / .... que equivale a (1 + 2) / (3 + 4)
//        ... quer dizer, que consiga resolver expressões compostas por valores inteiros ou em ponto flutuante e operações básicas + (adição), - (subtração), * (multiplicação), / (divisão) e ^ (exponenciação).
//
//Sua solução deve ser composta por uma classe Calculadora, a qual possibilita realizar contas aritméticas seguindo essa notação. Implementa sua Calculadora de acordo com o diagrama de classes a seguir:
//
//calculadora
//
//A Calculadora pode ser usada de duas maneiras:
//
//Usar o método calcula para calcular uma expressão contida em uma String
//Usar os métodos adiciona_numero e faz_operacao para fornecer cada elemento de uma expressão, possibilitando o cálculo gradual
//O método completa() informa se a calculadora possui um resultado, o qual pode ser obtido por meio do método resultado().
//
//A Calculadora deve disparar uma exceção no caso de erro no cálculo de uma expressão.
//
//Seu programa deve ler do teclado a expressão a ser calculada, calcular o resultado usando sua Calculadora, e então apresentar o resultado na saída padrão (na tela). Se a expressão for inválida, ele deve mostrar a mensagem ERRO.
//
//Um algoritmo geral pode ser criado usando uma pilha, e está descrito a seguir:
//
//Seja a pilha P1 inicialmente vazia
//Para cada elemento da expressão:
//Se for um número, empilhe-o em P1 e volte ao passo 2
//Se for um operador, faça o seguinte:
//Desempilhe dois números da pilha P1
//Calcule a operação com esses dois números
//Empilhe em P1 o resultado da operação, e volte ao passo 2
//Ao final, o resultado deve ser o único valor existente em P1