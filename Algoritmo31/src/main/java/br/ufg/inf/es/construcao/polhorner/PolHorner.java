package br.ufg.inf.es.construcao.polhorner;

/** algoritmo que implementa o esquema de horner para avalia��o dos poli�mios;
 */
public class PolHorner {
    /**
     *
     * @param a vetor;
     * @param g �ndice do vetor a;
     * @param x n�mero de elementos a ser verificado;
     * @return valor do polin�mio;
     * IllegalArgumentException caso g seja menor que ou tamanho do vetor seja
     * menor que g + 1;
     *
     */
    public static int polHorner(int [] a, int g, int x){
        if (g < 1){
            throw new IllegalArgumentException("G Inv�lido");
        }

        if (a.length <g+1){
            throw new IllegalArgumentException("Tamanho do Vetor Inv�lido");
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
