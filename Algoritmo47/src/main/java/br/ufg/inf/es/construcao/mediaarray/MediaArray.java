package br.ufg.inf.es.construcao.mediaarray;

/**
 * Algoritmo que implementa a média do soma dos n primeiros elementos do array;
 */
public class MediaArray {
    /**
     *
     *
     * @param A Elementos do array;
     * @param n primeiros termos do array que serão somados;
     * @return s/n media entre soma dos array pela sua quantidade;
     * @throws IllegalArgumentException caso:
     * tamanho do vetor seja menor que n+ 1;
     *  parametro n seja menor que 0;
     */
    public static double mediaArray(int A[],int n){
        if (A.length < (n + 1)) {
            throw new IllegalArgumentException("tamanho do vetor");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n inválido");
        }

        double s = SomaArray.somaArray(A,n);

        return s / n;
    }
}
