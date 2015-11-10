package br.ufg.inf.es.construcao.luhn;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuhnTest {

    @Test(expected = IllegalArgumentException.class)
    public void TestVetorInvalido() {
        int vetor [] = {0};
        Luhn.luhn(vetor);
    }

    @Test
    public void testLuhn() throws Exception {
        int vetor [] = {1,2,3,4,23,2,3,2,2,1};
        int vetor1 [] = {1,2,44,32,2,2,1};
        int vetor2 [] = {1,1};
        assertEquals(7,Luhn.luhn(vetor));
        assertEquals(2,Luhn.luhn(vetor1));
        assertEquals(8,Luhn.luhn(vetor2));
    }
}