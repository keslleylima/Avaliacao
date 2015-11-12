package br.ufg.inf.es.construcao.somafat;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaFatTest {

    @Test (expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception{
        SomaFat.verifica(-10);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testNumeroComZeros() throws Exception{
        SomaFat.verifica(400);
    }

    @Test
    public void testFatorialCorreto() throws Exception {
        assertTrue( SomaFat.verifica(145));
    }

    @Test
    public void testFatorialIncorreto() throws Exception{
        assertFalse( SomaFat.verifica(111));
        assertFalse( SomaFat.verifica(131));
    }
}