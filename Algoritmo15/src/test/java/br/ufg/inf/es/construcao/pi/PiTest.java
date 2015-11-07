package br.ufg.inf.es.construcao.pi;

import org.junit.Test;
import static org.junit.Assert.*;

public class PiTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() {
        Pi.pi(0);
        Pi.pi(-2);
    }

    @Test
    public void testPi5() throws Exception {
    assertEquals(3.3391,Pi.pi(5),0.001);
    }

    @Test
    public void testPi50() throws Exception {
        assertEquals(3.1215,Pi.pi(50),0.0001);
    }

    @Test
    public void testPi500() throws Exception {
        assertEquals(3.1395,Pi.pi(500),0.001);
    }

    @Test
    public void testPi445() throws Exception {
        assertEquals(3.14,Pi.pi(445),0.01);
    }
}
