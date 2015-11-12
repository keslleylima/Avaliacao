package br.ufg.inf.es.construcao.divide;

/**
 * algoritmo que implementa o produto entre dois numeros utilizando apenas soma;
 */
public class Produto {
    /**
     *
     * @param a número qualquer que seja maior que 0;
     * @param b número igual ou maior do que 0;
     * @return s resultado do produto entre a e b;
     * @throws IllegalArgumentException caso a ou b
     * nao satisfazerem a condição;
     * variavel i funciona com contador dentro do loop;
     */
    public static int produto(int a, int b) {
        if (a < 0 ) {
            throw new IllegalArgumentException("a não pode ser menor que 0");
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
