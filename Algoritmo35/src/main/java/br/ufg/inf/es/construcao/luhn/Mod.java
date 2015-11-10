package br.ufg.inf.es.construcao.luhn;

/**
 * implementa��o do algoritmo que efetua x % y;
 */
public class Mod {
    /**
     *
     * @param x primeiro valor entrada,deve ser maior que 0;
     * @param y segundo valor entrada,deve ser maior ou igual a 0;
     * @return s valor do resto da divis�o entre x e y;
     * IllegalArgumentException caso x ou y n�o atenda as condi��es;
     *
     */
    public static int mod(int x,int y){
        if (x <= 0){
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y < 0){
            throw new IllegalArgumentException("y inv�lido");
        }
        int s = x;
        while (s >= y){
            s = s - y;
        }

        return s;
    }
}