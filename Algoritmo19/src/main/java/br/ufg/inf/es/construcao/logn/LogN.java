package br.ufg.inf.es.construcao.logn;

/**
 * algoritmo que implementa o logaritmo natural  entre n e k;
 */
public class LogN {
    /**
     *
     * @param n primeiro valor de entrada que deve ser maior ou igaul a 1;
     * @param k segundo valor de entrada que deve ser maior ou igual a 2;
     * @return e valor do do log natural entre n e k;
     * @throws IllegalArgumentException quando os valores de entrada nao atende
     * as condições do loop;
     * variavel de controle do loop : i;
     */
    public static double logN(int n, int k){
        if (n < 1){
            throw new IllegalArgumentException("n inválido");
        }

        if (k < 2){
            throw new IllegalArgumentException("k Invalido");
        }

        int i = 2;
        double e = n + 1;
        double t = n;

        while (i <= k){
            t = (t * n) / i;
            e = e + t;
            i = i + 1;
        }

        return e;
    }
}
