package br.ufg.inf.es.construcao.potenciasoma;

/**
 * Algoritmo que implementa produto usando apenas somas;
 */
public class Produto {

    public static int produto(int a, int b) {

        if (a < 0) {
            throw new IllegalArgumentException("a inválido");
        }

        if ( b < 0) {
            throw new IllegalArgumentException("b inválido");
        }
        int i = 1;
        int s = 0;
        while (i <= b) {
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}
