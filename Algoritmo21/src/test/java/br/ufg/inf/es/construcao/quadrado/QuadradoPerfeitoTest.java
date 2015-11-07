package br.ufg.inf.es.construcao.quadrado;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuadradoPerfeitoTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() {
        QuadradoPerfeito.quadradoPerfeito(0);
        QuadradoPerfeito.quadradoPerfeito(-3);
    }

    @Test
    public void testNaoQuadradoPerfeito() throws Exception {
        assertFalse(QuadradoPerfeito.quadradoPerfeito(3));
        assertFalse(QuadradoPerfeito.quadradoPerfeito(7));
        assertFalse(QuadradoPerfeito.quadradoPerfeito(11));
    }

    @Test
    public void TestQuadradoPerfeito() throws Exception {
        assertTrue(QuadradoPerfeito.quadradoPerfeito(4));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(16));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(9));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(36));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(100));
        assertTrue(QuadradoPerfeito.quadradoPerfeito(64));

    }
}