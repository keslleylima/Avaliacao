package br.ufg.inf.es.construcao.lognaturalsimples;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LogNaturalSimplesTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        LogNaturalSimples.logNaturalSimples(0,3);
        LogNaturalSimples.logNaturalSimples(-3,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        LogNaturalSimples.logNaturalSimples(1,1);
        LogNaturalSimples.logNaturalSimples(2,0);
        LogNaturalSimples.logNaturalSimples(3,-33);
    }

    @Test
    public void testLogNaturalSimples12() throws Exception {
        Assert.assertEquals(2.5,LogNaturalSimples.logNaturalSimples(1,2),0.01);
    }

    @Test
    public void testLogNaturalSimples23() throws Exception {
        Assert.assertEquals(6.33,LogNaturalSimples.logNaturalSimples(2,3),0.01);
    }

    @Test
    public void testLogNaturalSimples13() throws Exception {
        Assert.assertEquals(2.66,LogNaturalSimples.logNaturalSimples(1,3),0.01);
    }
}