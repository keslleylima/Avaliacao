package br.ufg.inf.es.construcao.crivo;

/**
 * algoritmo que implementa O Crivo de Eratóstenes(um método simples e prático;
 * para encontrar números primos até um certo valor;
 */
public class CrivoEratostenes {
    /**
     *
     * @param a tamanho do vetor;
     * @param n última  posição do vetor a verificar;
     * @throws IllegalArgumentException caso:
     *seja menor que 2;
     *o tamanho do vetor a seja menor que n+1;
     *ou o vetor não posicao i que vai de 2 até n seja diferente de 0;
     *
     */
    public static void crivoEratostenes(int[] a, int n){
        if (n < 2) {
            throw new IllegalArgumentException("n Inválido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho do vetor inválido");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Valor inválido");
            }
        }

        int i = 2;

        while (i <= n / 2) {
            if (a[i] == 0) {
                int c = i + i;
                while (c <= n) {
                    a[c] = 1;
                    c = c + i;
                }
            }

            i += 1;
        }
    }
}
