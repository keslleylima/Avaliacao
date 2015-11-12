package br.ufg.inf.es.construcao.polhorner;

/** algoritmo que implementa o esquema de horner para avaliação dos poliômios;
 */
public class PolHorner {
    /**
     *
     * @param a vetor;
     * @param g índice do vetor a;
     * @param x número de elementos a ser verificado;
     * @return valor do polinômio;
     * @throws IllegalArgumentException caso g seja menor que ou tamanho do vetor seja
     * menor que g + 1;
     *
     */
    public static int polHorner(int [] a, int g, int x){
        if (g < 1){
            throw new IllegalArgumentException("G Inválido");
        }

        if (a.length <g+1){
            throw new IllegalArgumentException("Tamanho do Vetor Inválido");
        }

        int p = a[g];
        int i = g - 1;

        while (i >= 0){
            p = (p * x) + a[i];
            i = i - 1;
        }

        return p;
    }
}
