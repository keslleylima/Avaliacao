package br.ufg.inf.es.construcao.divide;

/**
 * implementação do algoritmo que divide x por y utilizando apenas soma
 * o resultado e o último divisor inteiro EX: 5/2 = 2 e não 2.5;
 */
public class DivideSomas {
    /**
     *
     * @param x primeiro valor de entrada,sendo maior ou igaula a 0;
     * @param y segundo valor de entrada,sendo maior do que zero;
     * @return d valor da divisao de x por y;
     * IllegalArgumentException caso x ou y não atenda as condições;
     *
     */
    public static int divideSoma(int x,int y){
        if (x < 0){
            throw new IllegalArgumentException("x inválido");
        }
        if (y <= 0){
            throw new IllegalArgumentException("y inválido");
        }

        int d = 0;
        int s = y;

        while (s <= x){
            s = s + y;
            d = d + 1;
        }

        return d;
    }
}