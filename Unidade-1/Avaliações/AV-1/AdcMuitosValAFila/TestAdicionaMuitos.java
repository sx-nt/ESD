import esd.Fila;
import org.junit.jupiter.api.DisplayName;
// import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.IntegerConversion;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

class TestAdicionaMuitos {

    ArrayList<Integer> gera_lista(int n) {
        ArrayList<Integer> q = new ArrayList<>();
        Random rand = new Random();

        for (int j=0; j < n; j++) {
            q.add(rand.nextInt(20));
        }

        return q;
    }

    Fila<Integer> gera_fila(ArrayList<Integer> lista) {
        Fila<Integer> q = new Fila<>();
        for (var x: lista) {
            q.adiciona(x);
        }
        return q;
    }

    boolean verifica_filas(Fila<Integer> q1, ArrayList<Integer> f1, ArrayList<Integer> f2) {
        // confere se valoes originais da fila estão lá armazenados
        for (var x: f1) {
            if (! x.equals(q1.remove())) {
                return false;
            }
        }
        // confere se valores da outra fila estão armazenados nesta fila
        for (var x: f2) {
            if (! x.equals(q1.remove())) {
                return false;
            }
        }
        return true;

    }
    @org.junit.jupiter.api.Test
    @DisplayName("Testa adicionar valores de uma fila vazia")
    void adiciona_vazia() throws InterruptedException, IOException {
        var f1 = gera_lista(7);
        Fila<Integer> q1 = new Fila<>();
        for (var x: f1) {
            q1.adiciona(x);
        }
        Fila<Integer> q2 = new Fila<>();

        q1.adiciona_muitos(q2);

        // Comprimento da fila não pode ter modificado, pois a outra fila estava vazia
        assert(q1.comprimento() == f1.size());

        // Outra fila deve permanecer vazia
        assert(q2.estaVazia());

        // Conteúdo da fila deve ser o mesmo de antes, acrescentado dos valores da nova fila
        assert(verifica_filas(q1, f1, new ArrayList<Integer>()));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testa adicionar valores de uma fila que contém alguns valores")
    void adiciona() throws InterruptedException, IOException {
        var f1 = gera_lista(7);
        var q1 = gera_fila(f1);
        var f2 = gera_lista(5);
        var q2 = gera_fila(f2);

        q1.adiciona_muitos(q2);

        // Comprimento da fila não pode ter modificado, pois a outra fila estava vazia
        assert(q1.comprimento() == f1.size() + f2.size());

        // Outra fila deve estar vazia
        assert(q2.estaVazia());

        // Conteúdo da fila deve ser o mesmo de antes, acrescentado dos valores da nova fila
        assert(verifica_filas(q1, f1, f2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testa adicionar em uma fila vazia os valores de uma fila que não está vazia")
    void adiciona_em_fila_vazia() throws InterruptedException, IOException {
        ArrayList<Integer> f1 = new ArrayList<>();
        var q1 = gera_fila(f1);
        var f2 = gera_lista(5);
        var q2 = gera_fila(f2);

        q1.adiciona_muitos(q2);

        // Comprimento da fila não pode ter modificado, pois a outra fila estava vazia
        assert(q1.comprimento() == f2.size());

        // Outra fila deve estar vazia
        assert(q2.estaVazia());

        // Conteúdo da fila deve ser o mesmo de antes, acrescentado dos valores da nova fila
        assert(verifica_filas(q1, f1, f2));
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testa adicionar em uma fila vazia os valores de uma fila também vazia")
    void adiciona_filas_vazias() throws InterruptedException, IOException {
        Fila<Integer> q1 = new Fila<>();
        Fila<Integer> q2 = new Fila<>();

        q1.adiciona_muitos(q2);

        // Comprimento da fila não pode ter modificado, pois a outra fila estava vazia
        assert(q1.estaVazia());

        // Outra fila deve estar vazia
        assert(q2.estaVazia());

    }
}
