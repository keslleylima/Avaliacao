package br.ufg.inf.es.construcao.imprimearray;

/**
 * Implementa��o do algoritmo que imprime um array escolhido pelo �suario;
 */
public class ImprimeArray {
    /**
     *
     * @param A array que ser� impresso;
     * @param n n�mero de elementos do vetor;
     * @throws IllegalArgumentException caso:
     * tamanho do vetor seja menor que seu n�mero de elementos;
     * n�mero de elementos seja menor que 0;
     */
    public static void imprimeArray(char[] A, int n) {
        if (A.length < n) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 0;

        while (i < n) {
            System.out.print(" " + A[i]);
            i = i + 1;
        }
    }
}
