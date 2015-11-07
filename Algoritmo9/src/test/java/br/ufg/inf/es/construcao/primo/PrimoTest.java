package br.ufg.inf.es.construcao.primo;

import org.junit.Assert;
import org.junit.Test;

public class PrimoTest {

    @Test(expected = IllegalArgumentException.class)
    public void TestPrimeiroParametroInvalido() {
        Primo.primo(-1);
        Primo.primo(0);
        Primo.primo(-222);
    }

    @Test
    public void testPrimo() throws Exception {
        Assert.assertTrue(Primo.primo(2));
        Assert.assertTrue(Primo.primo(3));
        Assert.assertTrue(Primo.primo(5));
        Assert.assertTrue(Primo.primo(17));
    }

    @Test
    public void testNaoPrimo() throws Exception {
        Assert.assertFalse(Primo.primo(4));
        Assert.assertFalse(Primo.primo(44));
        Assert.assertFalse(Primo.primo(9));
        Assert.assertFalse(Primo.primo(340));
    }
}