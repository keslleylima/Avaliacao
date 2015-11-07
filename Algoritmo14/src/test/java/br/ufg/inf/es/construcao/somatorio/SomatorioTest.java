package br.ufg.inf.es.construcao.somatorio;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomatorioTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() {
        Somatorio.somatorio(0);
        Somatorio.somatorio(-2);
    }

    @Test
    public void testSomatorio4() throws Exception {
        assertEquals(0.85,Somatorio.somatorio(4), 0.01);
    }

    @Test
    public void testSomatorio10() throws Exception {
        assertEquals(0.9815,Somatorio.somatorio(10), 0.001);
    }

    @Test
    public void testSomatorio20() throws Exception {
        assertEquals(1.0279,Somatorio.somatorio(20), 0.0001);
    }
}
