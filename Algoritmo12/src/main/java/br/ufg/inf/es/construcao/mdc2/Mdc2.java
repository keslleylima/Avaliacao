package br.ufg.inf.es.construcao.mdc2;

/**
 * algoritmo que implementa uma das poss�veis formas de obter o mdc entre a e b;
 */
public class Mdc2 {
    /**
     *
     * @param a n�mero/valor de entrada que deve maior ou igual a b;
     * @param b n�mero/valor de entrada que deve ser maior q zero;
     * @return a valor do Mdc  entre a e b;
     * IllegalArgumentException caso a ou b nao atenda as condi��es;
     *
     */
    public static int mdc2(int a,int b) {
        if (a < b){
           throw new IllegalArgumentException("a inv�lido ");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inv�lido ");
        }

        while (a != b){
            if (a > b){
                a = a - b;
            }else {
                b = b - a;
            }
        }

        return a;
    }
}
