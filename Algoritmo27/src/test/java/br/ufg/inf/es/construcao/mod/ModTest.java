package br.ufg.inf.es.construcao.mod;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametrInvalido() {
        Mod.mod(0,2);
        Mod.mod(-2,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        Mod.mod(1,-1);
    }

    @Test
    public void testMod() throws Exception {
        assertEquals(0,Mod.mod(1,1));
        assertEquals(1,Mod.mod(5,2));
        assertEquals(4,Mod.mod(24,10));
        assertEquals(0,Mod.mod(10,5));
    }
}