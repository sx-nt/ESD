//magine que um programa interaja com o usuário para executar comandos que ele digite, de forma parecida com o shell. Esse programa deve então ler um comando e  executá-lo, depois do que deve esperar um novo comando, e assim por diante. Agora imagine que exista um comando especial chamado historico, que faz com que o 5 últimos comandos digitados sejam apresentados (ordenados do mais recente para o mais antigo).
//
//Escreva um programa que simule a execução de comandos, porém implemente o comando historico. Assim, cada comando que o usuário digitar deve ser lido pelo programa, e a execução do comando deve ser simulada com a string "comando executado". Seu programa, portanto, deve implementar um laço que executa repetidamente o seguinte:
//
//O programa deve apresentar este prompt: ">"
//Se for digitado o comando "historico", o programa deve apresentar os últimos cinco comandos digitads, ordenados do mais recente para o mais antigo
//Se for digitado o comando "sair" o programa deve terminar
//Se for digitado qualquer outro comando, o programa deve mostrar "comando executado" na tela
//Veja o seguinte exemplo de execução desse programa:
//
//        > mostra
//comando executado
//> apaga algo
//comando executado
//> lista tudo
//comando executado
//> data
//comando executado
//> historico
//        data
//lista tudo
//apaga algo
//mostra
//>