//Escreva um programa que leia linhas de um arquivo, e mostre-as da seguinte forma:
//
//Sequências de linhas iniciadas com letras maiúsculas devem ser mostradas na ordem em que foram lidas
//Sequências de linhas que não são iniciadas com maiúsculas devem ser mostradas em ordem inversa em que foram lidas.
//        Por exemplo, se o arquivo tiver este conteúdo:
//
//O RETIRANTE EXPLICA AO LEITOR QUEM É E A QUE VAI
//— O meu nome é Severino,
//não tenho outro de pia.
//Como há muitos Severinos,
//que é santo de romaria,
//deram então de me chamar
//Severino de Maria;
//como há muitos Severinos
//com mães chamadas Maria,
//fiquei sendo o da Maria
//do finado Zacarias.
//        ... o resultado deve ser este:
//
//O RETIRANTE EXPLICA AO LEITOR QUEM É E A QUE VAI
//não tenho outro de pia.
//— O meu nome é Severino,
//Como há muitos Severinos,
//deram então de me chamar
//que é santo de romaria,
//Severino de Maria;
//do finado Zacarias.
//fiquei sendo o da Maria
//com mães chamadas Maria,
//como há muitos Severinos
//O nome do arquivo é informado como primeiro argumento de linha de comando. Se o arquivo não existir, ou não puder ser lido, seu programa deve apresentar esta mensagem na tela:
//
//arquivo invalido
//Se o arquivo estiver vazio, seu programa deve terminar sem apresentar qualquer resultado na tela