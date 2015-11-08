package br.ufg.inf.es.construcao.somadivisores;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaDivisoresTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        SomaDivisores.somaDivisores(0);
        SomaDivisores.somaDivisores(-3);
    }

    @Test
    public void testSomaDivisoresDe4() throws Exception {
        assertEquals(3,SomaDivisores.somaDivisores(4));
    }

    @Test
    public void testSomaDivisoresDe5() throws Exception {
        assertEquals(1,SomaDivisores.somaDivisores(5));
    }

    @Test
    public void testSomaDivisoresDe12() throws Exception {
        assertEquals(16,SomaDivisores.somaDivisores(12));
    }

    @Test
    public void testSomaDivisoresDe36() throws Exception {
        assertEquals(55,SomaDivisores.somaDivisores(36));
    }
}