package br.ufg.inf.es.construcao.hipotenusa;

/**
 * Implementa��o do algoritmo que efetua c�lculo da raiz quadrada de n
 * com apenas opera��es de soma,subtra��o e divis�o;
 */
public class RaizQuadrada {
    /**
     *
     * @param n Primeiro valor de entrada(raiz);
     * @param i Segundo valor de entrada (grau de precis�o do valor da raiz);
     * @return r valor da raiz de indice i;
     * IllegalArgumentException caso n n�o atenda as condi��es;
     *
     */
    public static double raizQuadrada(double n,int i){
        if (n <= 0){
            throw new IllegalArgumentException("n inv�lido");
        }

        double r = 1;

        while (i >= 0){
            r = ((r + (n / r))/2);
            i = i + 1;
        }

        return r;
    }

}