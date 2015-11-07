package br.ufg.inf.es.construcao.potencia;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PotenciaTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroValorEntradaInvalido() {
        Potencia.potencia(-1,3);
        Potencia.potencia(-333,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoValorEntradaInvalido() {
        Potencia.potencia(1,-22);
        Potencia.potencia(2,-1);
    }

    @Test
    public void testPotencia() throws Exception {
        Assert.assertEquals(8,Potencia.potencia(2,3));
        Assert.assertEquals(1024,Potencia.potencia(2,10));
        Assert.assertEquals(512,Potencia.potencia(2,9));
        Assert.assertEquals(25,Potencia.potencia(5,2));
    }
}