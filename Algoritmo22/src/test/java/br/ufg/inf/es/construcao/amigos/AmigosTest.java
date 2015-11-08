package br.ufg.inf.es.construcao.amigos;

import org.junit.Test;
import static org.junit.Assert.*;

public class AmigosTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        Amigos.amigos(-1,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        Amigos.amigos(1, -2);
    }

    @Test
    public void testAmigos() throws Exception {
        assertTrue(Amigos.amigos(1,1));
        assertTrue(Amigos.amigos(6,6));
    }

    @Test
    public void testNaoAmigos() throws Exception {
        assertFalse(Amigos.amigos(1, 2));
        assertFalse(Amigos.amigos(12,12));
        assertFalse(Amigos.amigos(4,4));
        assertFalse(Amigos.amigos(12,4));

    }
}