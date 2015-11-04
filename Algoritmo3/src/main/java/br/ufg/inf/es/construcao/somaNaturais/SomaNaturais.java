package br.ufg.inf.es.construcao.somaNaturais;

/**
 * implementação do algoritmo para verificar somatorio dos n numeros naturais;
 */
public class SomaNaturais {

    /**
     * @param n os n primeiros numeros naturais;
     * @return s , que é a soma dos primeiros n naturais;
     * @throws java.lang.IllegalArgumentException caso n não seja maior que
     *                                           1;
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N inválido");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + i;
            i = i + 1;
        }

        return s;
    }
}

