package br.ufg.inf.es.construcao.somaarray;

/**
 * Algoritmo que implementa o cálculo do n primeiros termos do do array;
 */
public class SomaArray {
         /**
         * @param A Elementos do array;
         * @param n primeiros termos do array que serão somados;
         * @return s soma dos n primeiros termos do array;
         * @throw IllegalArgumentException caso:
          * n seja menor que 0 ;
          * o tamanho do vetor seja menor que n +1;
          *
         */
        public static int somaArray(int[] A,int n) {
           if (A.length < (n + 1)) {
                throw new IllegalArgumentException("tamanho do vetor");
            }

            if (n < 0) {
                throw new IllegalArgumentException("n inválido");
            }

            int s = 0; // Acumula os valores dos elementos do array.
            int i = 1;

            while (i <= n) {
                s = s + A[i];
                i = i + 1;
            }

            return s;
        }
 }


