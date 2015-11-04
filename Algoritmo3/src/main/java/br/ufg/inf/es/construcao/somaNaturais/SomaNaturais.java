package br.ufg.inf.es.construcao.somaNaturais;

/**
 * implementa��o do algoritmo para verificar somatorio dos n numeros naturais;
 */
public class SomaNaturais {

    /**
     * @param n os n primeiros numeros naturais;
     * @return s , que � a soma dos primeiros n naturais;
     * @throws java.lang.IllegalArgumentException caso n n�o seja maior que
     *                                           1;
     */
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("N inv�lido");
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

