package br.ufg.inf.es.construcao.bublesort;

/**
 *Implementação do algoritmo que percorre o vetor diversas vezes fazendo que
 * no topo fique o maior elemento da sequência desse array;
 */
public class BubleSort {
    /**
     *
     * @param A vetor;
     * @param n ultimo iníce do vetor;
     * @throws IllegalArgumentException caso:
     * n  seja menor que 0;
     * tamanho do vetor seja menor que n + 1;
     */
    public static void bubleSort(int A[],int n) {
        if (n < 0){
            throw new IllegalArgumentException("n inválido");
        }

        if (A.length < n ){
            throw new IllegalArgumentException("Tamanho do vetor Inválido");
        }

        int p = n;
        while (p >= 1){
            int i = 0;
            while (i < p - 1){
                if (A[i] < A[i + 1]){
                    int t = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = t;
                }

                i = i + 1;
            }

            p = p - 1;
        }
    }
}
