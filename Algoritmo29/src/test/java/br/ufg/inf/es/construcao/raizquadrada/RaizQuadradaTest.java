package br.ufg.inf.es.construcao.raizquadrada;

import org.junit.Test;
import static org.junit.Assert.*;

public class RaizQuadradaTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvaldo(){
        RaizQuadrada.raizQuadrada(-1,2);
    }

    @Test
    public void testRaizQuadrada() throws Exception {
       assertEquals(2,RaizQuadrada.raizQuadrada(4, 100), 0.01);
       assertEquals(1.41,RaizQuadrada.raizQuadrada(2,10), 0.01);
       assertEquals(2,RaizQuadrada.raizQuadrada(4,5), 0.01);

    }
}