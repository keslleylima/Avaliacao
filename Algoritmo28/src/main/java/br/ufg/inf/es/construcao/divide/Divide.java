package br.ufg.inf.es.construcao.divide;

import java.net.SocketPermission;

/**
 * Algoritmo que implementa
 */
public class Divide {
    /**
     *
     * @param a primeiro valor de entrada;
     * @param b segundo valor de entrada;
     * @param k varivel de controle do loop;
     * @return 0;
     * IllegalArgumentException caso a ou b n�o atenda as condi��es;
     * System.out.print impress�o
     * DivideSomas.divideSoma e Produto.produto classes chamadas para
     * obter valor de d e r respectivamente;
     *
     */
    public static int divide(int a, int b,int k){
        if (a <= b){
            throw new IllegalArgumentException("a inv�lido");
        }

        if (b <= 0){
            throw new IllegalArgumentException("b inv�lido");
        }

        int d = DivideSomas.divideSoma(a,b);
        System.out.print(d);
        int r = a % b;
        if (r != 0){
            System.out.print(",");
        }

        while (r != 0 && k > 0){
            r = Produto.produto(10,r);
            d = DivideSomas.divideSoma(r,b);
            System.out.print(d);
            r = r % b;
            k = k - 1;
        }
        return 0;
    }
}
