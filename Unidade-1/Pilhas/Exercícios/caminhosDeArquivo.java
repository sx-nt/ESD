//Com respeito a caminhos para arquivos ou diretórios, escreva um método estático que reduza um caminho absoluto qualquer ao menor caminho absoluto possível. Por exemplo,  o caminho:
//
//        /home/aluno/Downloads/..
//        .. deve ser reduzido para :
//
//        /home/aluno
//Este outro caminho:
//
//        /usr/share/docs/../../lib/./x11
//        .. deve ser reduzido para:
//
//        /usr/lib/x11
//Abaixo segue a declaração do método a ser implementado:
//
//// reduz o "caminho", retornando como resultado o caminho reduzido
//String reduz_caminho(String caminho)
//Se o caminho for vazio, seu método deve retornar "".