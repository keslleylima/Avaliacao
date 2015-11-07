package br.ufg.inf.es.construcao.fatorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class FatorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParamentoInvalido() {
        Fatorial.fatorial(0);
        Fatorial.fatorial(-2);
    }

    @Test
    public void testFatorial6() throws Exception {
    assertEquals(720,Fatorial.fatorial(6));
    }

    @Test
    public void testFatorial7() throws Exception {
        assertEquals(5040,Fatorial.fatorial(7));
    }

    @Test
    public void testFatorial4() throws Exception {
        assertEquals(24,Fatorial.fatorial(4));
    }

    @Test
    public void testFatorial1() throws Exception {
        assertEquals(1,Fatorial.fatorial(1));
    }
}
