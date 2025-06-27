/**
 * O texto que contém o código-fonte de um programa em algumas linguagens de programação usa chaves,
 * parênteses e colchetes para delimitar
 * elementos do código. Por exemplo, em Java, C e C++ (pelo menos),
 * esses caracteres são usados para estas finalidades:
 *
 *         {}: delimita blocos de sentenças
 *         (): delimita expressões, ou listas de parâmetros em chamadas de métodos ou funções
 *         []: delimita índice de arrays
 * Um erro de digitação usual é estarem desbalanceados esses pares de caracteres. Por exemplo:
 *
 * Um ( não é fechado posteriormente por )
 * Um } não previamente aberto por {
 *       Sendo assim, escreva um programa que verifica se esses pares de caracteres estão balanceados.
 *       Seu programa deve fazer o seguinte:
 *
 * Se um caractere de fechamento for encontrado, mas não existe o caractere de abertura correspondente,
 * seu programa deve mostrar o número da linha e a posição do caractere de fechamento desbalanceado
 * existente nessa linha
 * Se um caractere de abertura não possuir um caractere de fechamento correspondente,
 * seu programa deve mostrar o número da linha e a posição do caractere de abertura
 * desbalanceado existente nessa linha
 * Uma pilha é bastante útil para resolver este problema !
 *
 * DICA: uma ideia para criar o balanceador está esboçada neste diagrama de classes:
 *
 * balanceador
 *
 * A verificação pode ser feita por um objeto Balanceador.
 * Seu método verifica analisa um arquivo, e retorna uma sequência de tokens sem correspondência.
 * Se não houver token sem correspondência, verifica retorna uma sequência vazia.
 */


public class balanceadorDeTexto {


}