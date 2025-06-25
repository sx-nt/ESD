//Um arquivo contém uma listagem das tarefas de um projeto, as quais possuem uma prioridade. Cada linha desse arquivo se apresenta desta forma:
//
//prioridade: tarefa
//Por exemplo:
//
//        4: documentar o subsistema A
//1: entrevistar o cliente
//2: modelar o subsistema B
//2: modelar o subsistema A
//1: identificar os requisitos do subsistema A
//3: implementar o subsistema A
//2: implementar o subsistema B
//
//Escreva um programa que leia um arquivo desses e apresente as tarefas ordenadas por suas prioridades (valores menores significam maiores prioridades).  O nome do arquivo é informado no primeiro argumento de linha de comando. No exemplo acima, o resultado seria este:
//
//        1: entrevistar o cliente
//1: identificar os requisitos do subsistema A
//2: modelar o subsistema B
//2: modelar o subsistema A
//2: implementar o subsistema B
//3: implementar o subsistema A
//4: documentar o subsistema A
//Observe que as tarefas de mesma prioridade devem estar na mesma ordem que no arquivo original.
//
//Sabendo que existem, no máximo, 5 níveis de prioridade (de 1 até 5), implemente o programa que faz esse ordenamento.
//
//DICA: você pode usar mais de uma fila !