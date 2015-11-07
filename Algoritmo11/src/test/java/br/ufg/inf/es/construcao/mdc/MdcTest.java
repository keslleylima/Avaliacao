package br.ufg.inf.es.construcao.mdc;

import org.junit.Test;
import org.junit.Assert;

public class MdcTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() throws Exception {
        Mdc.mdc(2,5);
        Mdc.mdc(4,20);
        Mdc.mdc(1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestSegundoInvalido() throws Exception {
        Mdc.mdc(3,-1);
        Mdc.mdc(4,-34);
        Mdc.mdc(3,0);
    }

    @Test
    public void testMdc() {
        Assert.assertEquals(6,Mdc.mdc(12, 6));
        Assert.assertEquals(4,Mdc.mdc(20, 12));
        Assert.assertEquals(4,Mdc.mdc(24, 20));
    }
}