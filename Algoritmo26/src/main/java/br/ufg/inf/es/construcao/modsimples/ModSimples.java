package br.ufg.inf.es.construcao.modsimples;

/**
 * algoritmo que implementa A divião x % y;
 */
public class ModSimples {
    /**
     *
     * @param x primeiro valor de entrada;
     * @param y segundo valor de entrada;
     * @return x -(d*y) que será o resto da divisão de x por y;
     * IllegalArgumentException caso x ou y nao atenda as condições;
     *
     */
    public static int  modSimples(int x,int y){
        if (x <= 0){
            throw new IllegalArgumentException("x inválido");
        }

        if (y <= 0){
            throw new IllegalArgumentException("y inválido");
        }

        int d = DivideSubtracoes.divideSubtracoes(x,y);

        return x - (d * y);
    }
}
