package br.ufg.inf.es.construcao.propriedade3025;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Propriedade3025Test {

    @Test(expected = IllegalArgumentException.class)
    public void TestEntradaInvalida() {
        Propriedade3025.propriedade3025(-1);
        Propriedade3025.propriedade3025(10000);
    }

    @Test
    public void testPropriedade3025() throws Exception {
        Assert.assertTrue(Propriedade3025.propriedade3025(0));
        Assert.assertTrue(Propriedade3025.propriedade3025(1));
        }

    @Test
    public void TestNaoPropriedade3025() throws Exception {
        Assert.assertFalse(Propriedade3025.propriedade3025(2));
    }
    }