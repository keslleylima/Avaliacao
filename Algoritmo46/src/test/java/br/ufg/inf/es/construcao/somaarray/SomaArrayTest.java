package br.ufg.inf.es.construcao.somaarray;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class SomaArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() {
       int A [] = {1,2,3,4,5};
        SomaArray.somaArray(A,-2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TamanhoVetorInvalido() {
        int A [] = {1,2,3,4,5};
        SomaArray.somaArray(A,5);
    }

    @Test
      public void testSomaArray() throws Exception {
        int A [] = {1,1,1,4,5,6,7};
        assertEquals(6,SomaArray.somaArray(A,3));
        assertEquals(1,SomaArray.somaArray(A,1));
        assertEquals(24,SomaArray.somaArray(A,6));
    }

    @Test
    public void testSomaArray4Primeiro() throws Exception {
        int A [] = {1,1,1,2,5,6,7};
        assertEquals(9,SomaArray.somaArray(A,4));
    }

}
