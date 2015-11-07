package br.ufg.inf.es.construcao.logn;

import org.junit.Test;
import static org.junit.Assert.*;

public class LogNTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        LogN.logN(0,2);
        LogN.logN(-3,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        LogN.logN(1,1);
        LogN.logN(1,0);
        LogN.logN(3,-3);
    }

    @Test
    public void testLogN() throws Exception {
        assertEquals(2.5,LogN.logN(1,2),0.1);
        assertEquals(8.5,LogN.logN(3,2),0.01);
        assertEquals(5.0,LogN.logN(2,2),0.01);
    }
}