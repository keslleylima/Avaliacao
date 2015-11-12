package br.ufg.inf.es.construcao.array;

import java.util.Scanner;

/**
 *  Implementação do algoritmo que imprime uma sequência de caracteres
 *  definida pelo úsuario;
 *
 */
public class Array {

    /**
     *
     * @param A array que será impresso;
     * @param n limite do array;
     * @throws IllegalArgumentException caso:
     * n seja menor que 0;
     * n seja maior que o tamanho total do array;
     */
    public static void imprime(char [] A, int n){
        if (n < 0){
            throw new IllegalArgumentException("N Inválido");
        }

        if (n > A.length){
            throw new IllegalArgumentException("Tamanho do vetor Inválido");
        }

        int i = 0;
        while (i < n){
            System.out.print( "  " + A[i]);
            i = i + 1;
        }
    }
}
