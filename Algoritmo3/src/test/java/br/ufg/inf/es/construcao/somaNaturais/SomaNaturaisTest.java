package br.ufg.inf.es.construcao.somaNaturais;

import org.junit.Assert;
import org.junit.Test;

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void EntradaInvalido() throws Exception {
        SomaNaturais.somaNaturais(0);
        SomaNaturais.somaNaturais(-333);
        SomaNaturais.somaNaturais(-3232321);
    }
    @Test
    public void testSomaNaturais() throws Exception {
        Assert.assertEquals(1,SomaNaturais.somaNaturais(1));
        Assert.assertEquals(3,SomaNaturais.somaNaturais(2));
        Assert.assertEquals(1,SomaNaturais.somaNaturais(1));
        Assert.assertEquals(1275,SomaNaturais.somaNaturais(50));
        Assert.assertEquals(5050,SomaNaturais.somaNaturais(100));
    }
}