package br.ufg.inf.es.construcao.modsimples;

/**
 * implementação do algoritmo que utliza subtração para dividir dois números;
 */
public class DivideSubtracoes {
    /**
     *
     * @param x primeiro valor de entrada,sendo maior ou igaula a 0;
     * @param y segundo valor de entrada,sendo maior do que zero;
     * @return d valor da divisao de x por y;
     * IllegalArgumentException caso x ou y não atenda as condições;
     *
     */
    public static int divideSubtracoes(int x,int y){
        if (x < 0){
            throw new IllegalArgumentException("x inválido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("y inválido");
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