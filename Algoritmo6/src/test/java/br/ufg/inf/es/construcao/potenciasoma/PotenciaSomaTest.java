package br.ufg.inf.es.construcao.potenciasoma;

import org.junit.Assert;
import org.junit.Test;

public class PotenciaSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroValorInvalido() {
        PotenciaSoma.potenciaSoma(-1,1);
        PotenciaSoma.potenciaSoma(-33,33);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoValorInvalido() {
        PotenciaSoma.potenciaSoma(1,-1);
        PotenciaSoma.potenciaSoma(3,0);
    }

    @Test
    public void testPotenciaSoma() throws Exception {
        Assert.assertEquals(1024,PotenciaSoma.potenciaSoma(2, 10));
        Assert.assertEquals(512,PotenciaSoma.potenciaSoma(2, 9));
    }
}