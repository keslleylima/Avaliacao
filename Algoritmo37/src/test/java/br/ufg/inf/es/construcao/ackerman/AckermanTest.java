package br.ufg.inf.es.construcao.ackerman;

import org.junit.Test;
import static org.junit.Assert.*;

public class AckermanTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        Ackerman.ackerman(-2, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSegundoParametroInvalido() {
        Ackerman.ackerman(0, -3);
    }

    @Test
    public void testCasosTriviais() {
        assertEquals(1, Ackerman.ackerman(0, 0));
        assertEquals(3, Ackerman.ackerman(1, 1));
        assertEquals(61, Ackerman.ackerman(3, 3));
        assertEquals(4, Ackerman.ackerman(1, 2));
    }
}