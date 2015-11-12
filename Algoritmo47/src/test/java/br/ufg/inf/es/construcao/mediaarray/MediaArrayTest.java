package br.ufg.inf.es.construcao.mediaarray;

import org.junit.Test;
import static org.junit.Assert.*;

public class MediaArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public  void TamanhoVetorInvalido() {
        int A[] = {1,2,3,4};
        MediaArray.mediaArray(A,5);
        MediaArray.mediaArray(A,4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ParametroIndiceNInvalido() {
        int A[] = {1,2,3,4};
        MediaArray.mediaArray(A,-2);
    }

    @Test
    public void testMediaArray() throws Exception {
        int A[] = {1,2,13,3,4,6,7,5,2,1};
        assertEquals(7.5,MediaArray.mediaArray(A,2),0.01);
        assertEquals(5.833, MediaArray.mediaArray(A, 6), 0.01);
    }
}