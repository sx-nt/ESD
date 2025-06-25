//Em uma famosa linguagem de programação, o código pode conter muitos parênteses aninhados, como neste exemplo:
//
//        (car (quote (a b)))
//
//        ... ou mesmo este:
//
//        (define fatorial
//        (lambda (n)
//     (let f ((i n) (resultado 1))
//        (if (= i 0)
//resultado
//        (f (- i 1) (* resultado i))))))
//Escreva um programa que leia um arquivo de texto contendo código no estilo dessa linguagem de programação, e apresente ao final o seguinte resultado:
//
//O símbolo de parêntese aberto e a linha e coluna em que se encontra o primeiro parêntese aberto mas não fechado, caso exista
//O símbolo de parêntese aberto e a linha e coluna em que se encontra o primeiro parêntese fechado mas não aberto, caso exista
//        Ou nada, se não houver parênteses desbalanceados