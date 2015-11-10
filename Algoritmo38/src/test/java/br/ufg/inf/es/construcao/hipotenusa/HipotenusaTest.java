package br.ufg.inf.es.construcao.hipotenusa;

import org.junit.Test;
import static org.junit.Assert.*;

public class HipotenusaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testPrimeiroParametroInvalido() {
        Hipotenusa.hipotenusa(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Hipotenusa.hipotenusa(1, 0);
    }

    @Test
    public void testHipotenusa() {
        assertEquals(5, Hipotenusa.hipotenusa(3, 4), 0.1);
        assertEquals(11.1, Hipotenusa.hipotenusa(5, 10), 0.1);
        assertEquals(4.47, Hipotenusa.hipotenusa(4, 2), 0.1);
    }
}