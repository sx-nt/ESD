package esd.Exercícios;

import esd.Pilha;

/**
 * Com respeito a caminhos para arquivos ou diretórios,
 * escreva um método estático que reduza um caminho absoluto
 * qualquer ao menor caminho absoluto possível.
 * Por exemplo,  o caminho:
 *
 *         /home/aluno/Downloads/..
 *         .. deve ser reduzido para :
 *
 *         /home/aluno
 * Este outro caminho:
 *
 *         /usr/share/docs/../../lib/./x11
 *         .. deve ser reduzido para:
 *
 *         /usr/lib/x11
 * Abaixo segue a declaração do método a ser implementado:
 *
 * // reduz o "caminho", retornando como resultado o caminho
 * reduzido
 * String reduz_caminho(String caminho)
 * Se o caminho for vazio, seu método deve retornar "".
 */

public class caminhosDeArquivo {

public static String reduzCaminho(String caminho){
    String caminhoPartes[] = caminho.split("/");

    Pilha<String> pilhaCaminhos = new Pilha<>();
    Pilha<String> pilhaInvertida = new Pilha<>();

    if (caminho == null){
        System.out.println("Caminho vazio");
        return "";
    }

    for (int i = 0; i < caminhoPartes.length; i ++){
        if(caminhoPartes[i].isEmpty() || caminhoPartes[i].equals(".")){
            continue;
        } else if (caminhoPartes[i].equals("..")) {
            pilhaCaminhos.desempilha();
        } else {
            pilhaCaminhos.empilha(caminhoPartes[i]);
        }
    }

    while (!pilhaCaminhos.estaVazia()) {
       pilhaInvertida.empilha(pilhaCaminhos.desempilha());
    }

    String resultado = "/";

    while(!pilhaInvertida.estaVazia()){
        resultado += pilhaInvertida.desempilha();
        if(!pilhaInvertida.estaVazia()){
            resultado += "/";
        }
    }

    return resultado;
}
    public static void main(String[] args) {
        System.out.println(reduzCaminho("/usr/share/docs/../../lib/./x11"));
    }
}