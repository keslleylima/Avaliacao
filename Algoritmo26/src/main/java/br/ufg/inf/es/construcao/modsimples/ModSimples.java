package br.ufg.inf.es.construcao.modsimples;

/**
 * algoritmo que implementa A divi�o x % y;
 */
public class ModSimples {
    /**
     *
     * @param x primeiro valor de entrada;
     * @param y segundo valor de entrada;
     * @return x -(d*y) que ser� o resto da divis�o de x por y;
     * IllegalArgumentException caso x ou y nao atenda as condi��es;
     *
     */
    public static int  modSimples(int x,int y){
        if (x <= 0){
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("y inv�lido");
        }

        int d = DivideSubtracoes.divideSubtracoes(x,y);

        return x - (d * y);
    }
}
