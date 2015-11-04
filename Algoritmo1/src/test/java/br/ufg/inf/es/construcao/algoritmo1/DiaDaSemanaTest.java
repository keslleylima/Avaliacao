package br.ufg.inf.es.construcao.algoritmo1;

import org.junit.Assert;
import org.junit.Test;

public class DiaDaSemanaTest {

    @Test(expected = IllegalArgumentException.class)
    public void TestDiaInvalido() throws Exception {
        DiaDaSemana.diaDaSemana(0,3,1900);
        DiaDaSemana.diaDaSemana(-8,3,1900);
        DiaDaSemana.diaDaSemana(34,3,1900);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestMesInvalido() throws  Exception {
        DiaDaSemana.diaDaSemana(3,0,1840);
        DiaDaSemana.diaDaSemana(5,23,2000);
        DiaDaSemana.diaDaSemana(12,-4,1932);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestAnoInvalido() throws Exception {
        DiaDaSemana.diaDaSemana(3,3,1752);
        DiaDaSemana.diaDaSemana(12,4,33);
        DiaDaSemana.diaDaSemana(2,5,232);
    }

    @Test
    public void testDiaDaSemanaValido() throws Exception {
        Assert.assertEquals(3, DiaDaSemana.diaDaSemana(29,10,2015));
        Assert.assertEquals(2, DiaDaSemana.diaDaSemana(11,6,1997));
        Assert.assertEquals(4, DiaDaSemana.diaDaSemana(30,10,2015));
        Assert.assertEquals(2, DiaDaSemana.diaDaSemana(14,8,1996));
        Assert.assertEquals(6, DiaDaSemana.diaDaSemana(29,10,1815));
        Assert.assertEquals(1, DiaDaSemana.diaDaSemana(1,11,2016));
    }
}

