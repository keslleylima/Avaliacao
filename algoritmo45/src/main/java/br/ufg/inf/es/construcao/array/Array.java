package br.ufg.inf.es.construcao.array;

import java.util.Scanner;

/**
 *  Implementa��o do algoritmo que imprime uma sequ�ncia de caracteres
 *  definida pelo �suario;
 *
 */
public class Array {

    /**
     *
     * @param A array que ser� impresso;
     * @param n limite do array;
     * @throws IllegalArgumentException caso:
     * n seja menor que 0;
     * n seja maior que o tamanho total do array;
     */
    public static void imprime(char [] A, int n){
        if (n < 0){
            throw new IllegalArgumentException("N Inv�lido");
        }

        if (n > A.length){
            throw new IllegalArgumentException("Tamanho do vetor Inv�lido");
        }

        int i = 0;
        while (i < n){
            System.out.print( "  " + A[i]);
            i = i + 1;
        }
    }
}
