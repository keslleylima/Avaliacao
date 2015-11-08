package br.ufg.inf.es.construcao.modsimples;

/**
 * implementa��o do algoritmo que utliza subtra��o para dividir dois n�meros;
 */
public class DivideSubtracoes {
    /**
     *
     * @param x primeiro valor de entrada,sendo maior ou igaula a 0;
     * @param y segundo valor de entrada,sendo maior do que zero;
     * @return d valor da divisao de x por y;
     * IllegalArgumentException caso x ou y n�o atenda as condi��es;
     *
     */
    public static int divideSubtracoes(int x,int y){
        if (x < 0){
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("y inv�lido");
        }

        int d = 0;
        int s = x;

        while (s >= y){
            s = s - y;
            d = d + 1;
        }

        return d;
    }
}