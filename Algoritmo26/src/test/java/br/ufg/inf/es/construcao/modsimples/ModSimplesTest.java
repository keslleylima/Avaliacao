package br.ufg.inf.es.construcao.modsimples;

import org.junit.Test;
import static org.junit.Assert.*;

public class ModSimplesTest {
    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvaldo() {
        ModSimples.modSimples(0,2);
        ModSimples.modSimples(-2,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        ModSimples.modSimples(2,0);
        ModSimples.modSimples(3,-3);
    }

    @Test
    public void testModSimplessResto0() throws Exception {
        assertEquals(0,ModSimples.modSimples(1,1));
        assertEquals(0,ModSimples.modSimples(10,5));
        assertEquals(0,ModSimples.modSimples(2, 2));
    }

    @Test
    public void testModSimplesResto1() throws Exception {
        assertEquals(1,ModSimples.modSimples(11, 2));
        assertEquals(1,ModSimples.modSimples(11, 2));
        assertEquals(1,ModSimples.modSimples(11, 2));
    }
}