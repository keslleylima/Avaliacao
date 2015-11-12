package br.ufg.inf.es.construcao.bublesort;

import org.junit.Test;
import static org.junit.Assert.*;

public class BubleSortTest {

    @Test(expected = IllegalArgumentException.class)
    public void TamanhoVetorInvalido() {
       int A[] = {1,2,3,4,5,6};
        BubleSort.bubleSort(A,8);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ParametroIndiceMaxInvalido() {
        int A[] = {1,2,3,4,5,6};
        BubleSort.bubleSort(A,-2);
    }

    @Test
    public void testBubbleSort() throws Exception {
        int[] A = {2,12,3,1,5};
        int[] AX = {12,5,3,2,1};
        BubleSort.bubleSort(A,5);
        for (int i = 1; i < A.length; i++){
            assertEquals(AX[i], A[i]);
        }
    }
}