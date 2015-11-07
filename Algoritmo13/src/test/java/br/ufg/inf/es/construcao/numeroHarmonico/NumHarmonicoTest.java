package br.ufg.inf.es.construcao.numeroHarmonico;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumHarmonicoTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParamentroInvalido() {
        NumHarmonico.numHarmonico(0);
        NumHarmonico.numHarmonico(-33);
    }

    @Test
    public void testNumHarmonico5() throws Exception {
        assertEquals(2.2833, NumHarmonico.numHarmonico(5), 0.001);
    }

    @Test
    public void testNumHarmonico8() throws Exception {
        assertEquals(2.71733, NumHarmonico.numHarmonico(8), 0.001);
    }

    @Test
    public void testNumHarmonico15() throws Exception {
        assertEquals(3.3182833, NumHarmonico.numHarmonico(15), 0.001);
    }
}
