package br.ufg.inf.es.construcao.amigos;

/**
 * implementação do algoritmo que efetua a soma dos divisores de um número;
 */
public class SomaDivisores {
    /**
     *
     * @param n valor de entrada que deve ser positvivo;
     * @return s, que é a soma dos divisores de n(no caso o próprio n não é
     * considera na soma dos divisores;
     * IllegalArgumentException caso n seja igual ou menor que 0;
     *
     */
    public static int somaDivisores(int n){
        if (n <= 0){
            throw new IllegalArgumentException("n inválido");
        }

        int d = 2;
        int s = 1;

        while (d <= n / 2){
            if (n % d == 0){
                s = s + d;
            }
            d = d + 1;
        }

        return s;
    }
}
