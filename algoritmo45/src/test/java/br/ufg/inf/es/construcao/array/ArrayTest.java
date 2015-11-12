package br.ufg.inf.es.construcao.array;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayTest {


    @Test (expected = IllegalArgumentException.class)
    public void testEntradaNInvalido() throws Exception {
        char[] A = {'K', 'E', 'S', 'L', 'L','E','Y'};
        Array.imprime(A, -1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testTamanhoInvalido() throws Exception {
        char[] A = {'1','2','3'};
        Array.imprime(A, 4);
    }

    @Test
    public void testImprime() throws Exception {
        char[] A = {'K', 'E', 'S', 'L', 'L','E','Y'};
        Array.imprime(A, 7);
        char[] B = {'L', 'I', 'M', 'A'};
        Array.imprime(B, 4);
    }
}