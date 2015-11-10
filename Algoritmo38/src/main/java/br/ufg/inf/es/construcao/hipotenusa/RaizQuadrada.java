package br.ufg.inf.es.construcao.hipotenusa;

/**
 * Implementação do algoritmo que efetua cálculo da raiz quadrada de n
 * com apenas operações de soma,subtração e divisão;
 */
public class RaizQuadrada {
    /**
     *
     * @param n Primeiro valor de entrada(raiz);
     * @param i Segundo valor de entrada (grau de precisão do valor da raiz);
     * @return r valor da raiz de indice i;
     * IllegalArgumentException caso n não atenda as condições;
     *
     */
    public static double raizQuadrada(double n,int i){
        if (n <= 0){
            throw new IllegalArgumentException("n inválido");
        }

        double r = 1;

        while (i >= 0){
            r = ((r + (n / r))/2);
            i = i + 1;
        }

        return r;
    }

}