package br.ufg.inf.es.construcao.inverte;

import org.junit.Test;
import static org.junit.Assert.*;

public class InverteTest {

    @Test
    public void testInverteArray2() {
        char[] A = {'A', 'B', 'C'};
        char[] B = {'C', 'B', 'A',};
        char[] C = Inverte.inverter(A);
        for (int i = 0; i < A.length; i++) {
            assertEquals(B[i], C[i]);
        }
    }

    @Test
    public void testInvertrArray1() {
        char[] A = {'K', 'E', 'S', 'L', 'L', 'E', 'Y'};
        char[] B = {'Y', 'E', 'L', 'L', 'S', 'E', 'K'};
        char[] C = Inverte.inverter(A);
        for (int i = 0; i < A.length; i++) {
            assertEquals(B[i], C[i]);
        }
    }
    @Test
    public void testInvertrArrayPalavraPalindroma() {
        char[] A = {'A', 'N', 'A'};
        char[] B = {'A', 'N', 'A'};
        char[] C = Inverte.inverter(A);
        for (int i = 0; i < A.length; i++) {
            assertEquals(B[i], C[i]);
        }
    }

}