package br.ufg.inf.es.construcao.fibonacci;

/**
 * Algoritmo que implementa o cálculo da sequência de fibonacci;
 */
public class Fibonacci {
    /**
     *
     * @param n números de termos;
     * @return c valor do n termo da da sequência de fibonacci ;
     *  termo anterior : a;
     *  termo corrente : c;
     *  IllegalArgumentException caso n seja menor que 0;
     *  if (n == 0 || n == 1) return n ,pois cada termo subsequente será a
     *  soma dos dois antecessores.
     */
    public static int fibonacci(int n){
        if (n < 0){
            throw new IllegalArgumentException("n inválido");
        }

        int a = 0;
        int c = 1;

        if (n == 0 || n == 1){
            return n;
        }

        int i = 2;

        while (i <= n){
            int t = c;
            c = c + a;
            a = t;
            i = i + 1;
        }

        return c;
    }
}
