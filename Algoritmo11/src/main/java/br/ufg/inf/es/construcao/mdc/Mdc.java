package br.ufg.inf.es.construcao.mdc;

/**
 * algoritmo que implementa o cálculo do Mdc entre a e b;
 */
public class Mdc {
    /**
     *
     * @param a número qualquer, desde que seja maior ou igual a b
     * @param b número que seja maior que 0;
     * @return a que é o mdc entre a e b;
     * @throws IllegalArgumentException  caso dados de entrada não atenda a condicao;
     *
     */
    public static  int mdc(int a,int b) {
        if (a < b) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }

        while (b != 0) {

            int m = a % b;
            a = b;
            b = m;
        }

        return a;
    }
}
