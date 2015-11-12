package br.ufg.inf.es.construcao.atendesomafatdigitos;

/**
 * algoritmo para determinar o fatorial de um determinado numero;
 */
public class Fatorial {
    /**
     *
     * @param n numero que deseja calcular seu fatorial;
     * @return f valor do fatorial de um numero(n);
     * IllegalArgumentException caso n seja menor que 1;
     * variavel de controle do loop : i;
     */
    public static int fatorial(int n){
        if (n < 1){
            throw new IllegalArgumentException("n invalido");
        }

        int i = 2;
        int f = 1;

        while (i <= n){
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
