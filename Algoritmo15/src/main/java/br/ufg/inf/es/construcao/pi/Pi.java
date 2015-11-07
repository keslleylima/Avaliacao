package br.ufg.inf.es.construcao.pi;

/**
 * Algoritmo para obtenção do valor de pi;
 */
public class Pi {
    /**
     *
     * @param n grau de precisão do pi;
     * @return p valor do pi ;
     * IllegalArgumentException caso n seja menor que 1;
     *varíavel de controle no loop : i;
     */
    public static double pi(int n){
        if (n < 1){
            throw new IllegalArgumentException("n invalido");
        }

        int i = 1;
        double s = -1;
        double d = -1;
        double p = 0;

        while (i <= n){
            d = d + 2;
            s = -1 * s;
            p = p + 4 * s / d;
            i = i + 1;
        }

        return p;
    }
}
