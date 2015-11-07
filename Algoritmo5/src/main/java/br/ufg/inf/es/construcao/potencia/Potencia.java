package br.ufg.inf.es.construcao.potencia;

/**
 * algoritmo que implementa a opera��o de pot�ncia entre dois n�meros;
 */
public class Potencia {
    /**
     *
     * @param x  n�mero qualquer positivo;
     * @param y  n�mero maior ou igual a zero;
     * @return p resultado da pot�ncia entre x e y;
     * throw new IllegalArgumentException caso x ou y nao atenda a condi��o;
     * vari�vel de controle do loop : i;
     */
    public static int potencia (int x, int y) {
        if ( x <= 0 ) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inv�lido");
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
