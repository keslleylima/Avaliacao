package br.ufg.inf.es.construcao.crivo;

/**
 * algoritmo que implementa O Crivo de Erat�stenes(um m�todo simples e pr�tico;
 * para encontrar n�meros primos at� um certo valor;
 */
public class CrivoEratostenes {
    /**
     *
     * @param a tamanho do vetor;
     * @param n �ltima  posi��o do vetor a verificar;
     *       IllegalArgumentException caso:
     *          n seja menor que 2;
     *          o tamanho do vetor a seja menor que n+1;
     *          ou o vetor n�o posicao i que vai de 2 at� n seja diferente de 0;
     *
     */
    public static void crivoEratostenes(int[] a, int n)
    {
        if (n < 2) {
            throw new IllegalArgumentException("n Inv�lido");
        }

        if (a.length < (n + 1)) {
            throw new IllegalArgumentException("Tamanho do vetor inv�lido");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Valor inv�lido");
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
