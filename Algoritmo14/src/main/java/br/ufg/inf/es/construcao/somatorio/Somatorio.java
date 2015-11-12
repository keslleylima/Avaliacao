package br.ufg.inf.es.construcao.somatorio;

/**
 * algoritmo que implementa o somatório de n numeros.
 */
public class Somatorio {
    /**
     *
     * @param n quantidade de numeros;
     * @return s soma dos n numeros reais;
     * variavel de controle do loop:i;
     *@throws IllegalArgumentException  caso n seja menor que 1;
     */
    public static double somatorio(int n){
       if (n < 1){
          throw new IllegalArgumentException("N inválido");
       }

        int i = 1;
        double s = 0;

        while (i <= n){
            double d = 1 + (i * i );
            s = s + 1 / d;
            i = i + 1;
        }

        return s;
    }
}
