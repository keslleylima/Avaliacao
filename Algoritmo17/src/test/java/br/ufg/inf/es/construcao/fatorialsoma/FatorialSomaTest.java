package br.ufg.inf.es.construcao.fatorialsoma;

import org.junit.Assert;
import org.junit.Test;

public class FatorialSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        FatorialSoma.fatorialSoma(0);
    }

    @Test
    public void testCasoDeFroteira() {
        Assert.assertEquals(1,FatorialSoma.fatorialSoma(1));
    }

    @Test
    public void testFatorialSoma() {
        Assert.assertEquals(6,FatorialSoma.fatorialSoma(3));
        Assert.assertEquals(2,FatorialSoma.fatorialSoma(2));
    }
}