package br.ufg.inf.es.construcao.divide;

/**
 * algoritmo que implementa o produto entre dois numeros utilizando apenas soma;
 */
public class Produto {
    /**
     *
     * @param a n�mero qualquer que seja maior que 0;
     * @param b n�mero igual ou maior do que 0;
     * @return s resultado do produto entre a e b;
     * throw new IllegalArgumentException caso a ou b
     * nao satisfazerem a condi��o;
     * variavel i funciona com contador dentro do loop;
     */
    public static int produto(int a, int b) {
        if (a < 0 ) {
            throw new IllegalArgumentException("a n�o pode ser menor que 0");
        }

        if (b < 0) {
            throw new IllegalArgumentException("b nao pode ser menor que 0");
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