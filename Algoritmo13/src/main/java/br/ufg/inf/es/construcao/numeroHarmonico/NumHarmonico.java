package br.ufg.inf.es.construcao.numeroHarmonico;

/**
 * algoritmo que define o valor de uma sequencia númerica harmônica ate 1/n;
 */
public class NumHarmonico {
    /**
     *
     * @param n número dos elementos da sequência númerica ;
     * @return s valor da soma da sequênçia harmônica;
     * @throws IllegalArgumentException caso n seja menor que 1;
     * varíavel de controle do loop : i;
     *
     */
    public static double numHarmonico(int n) {
        if (n < 1){
            throw new IllegalArgumentException("n inválido");
        }

        double i = 2;
        double s = 1;

        while (i <= n){
            s = s + 1 / i;
            i = i + 1;
        }

        return s;
    }
}
