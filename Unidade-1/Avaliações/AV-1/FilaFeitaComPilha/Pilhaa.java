//Uma fila pode ser implementada usando duas pilhas. Assim, se já existir uma implementação de pilha, uma fila pode ser criada a partir delas com relativa facilidade. Se uma fila assim fosse definida, seria parecida com isto:
//
//public class NovaFila <T> {
//    Pilha<T> p1 = new Pilha<>();
//    Pilha<T> p2 = new Pìlha<>();
//
//    public NovaFila() {}
//
//    public int comprimento() {
//    }
//
//    public int capacidade() {
//    }
//
//    public T remove() {
//    }
//
//    public T frente() {
//    }
//
//    public void adiciona(T val) {
//    }
//
//    public boolean estaVazia() {
//    }
//
//    public void limpa() {
//    }
//
//}
//Implemente essa nova fila, de forma que seja intercambiável com a Fila já existente. Isso significa que, para quem for usar a fila, tanto faz uma ou outra, pois funcionalmente são idênticas. Para testar sua nova fila, você pode usar o seguinte teste de unidade: