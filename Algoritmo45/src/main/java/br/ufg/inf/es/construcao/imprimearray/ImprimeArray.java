package br.ufg.inf.es.construcao.imprimearray;

/**
 * Implementação do algoritmo que imprime um array escolhido pelo úsuario;
 */
public class ImprimeArray {
    /**
     *
     * @param A array que será impresso;
     * @param n número de elementos do vetor;
     * @throws IllegalArgumentException caso:
     * tamanho do vetor seja menor que seu número de elementos;
     * número de elementos seja menor que 0;
     */
    public static void imprimeArray(char[] A, int n) {
        if (A.length < n) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = 0;

        while (i < n) {
            System.out.print(" " + A[i]);
            i = i + 1;
        }
    }
}
