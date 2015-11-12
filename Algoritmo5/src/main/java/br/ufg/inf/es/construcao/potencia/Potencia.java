package br.ufg.inf.es.construcao.potencia;

/**
 * algoritmo que implementa a operação de potência entre dois números;
 */
public class Potencia {
    /**
     *
     * @param x  número qualquer positivo;
     * @param y  número maior ou igual a zero;
     * @return p resultado da potência entre x e y;
     * @throws IllegalArgumentException caso x ou y nao atenda a condição;
     * variável de controle do loop : i;
     */
    public static int potencia (int x, int y) {
        if ( x <= 0 ) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inválido");
        }

        int i = 1;
        int p = 1;

        while (i <= y) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }
}
