package br.ufg.inf.es.construcao.bublesort;

/**
 *Implementa��o do algoritmo que percorre o vetor diversas vezes fazendo que
 * no topo fique o maior elemento da sequ�ncia desse array;
 */
public class BubleSort {
    /**
     *
     * @param A vetor;
     * @param n ultimo in�ce do vetor;
     * @throws IllegalArgumentException caso:
     * n  seja menor que 0;
     * tamanho do vetor seja menor que n + 1;
     */
    public static void bubleSort(int A[],int n) {
        if (n < 0){
            throw new IllegalArgumentException("n inv�lido");
        }

        if (A.length < n ){
            throw new IllegalArgumentException("Tamanho do vetor Inv�lido");
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
