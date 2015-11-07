package br.ufg.inf.es.construcao.mdc2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Mdc2Test {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        Mdc2.mdc2(1,2);
        Mdc2.mdc2(2,4);
        Mdc2.mdc2(-1,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public  void SegundoParamentroInvalido() {
        Mdc2.mdc2(3,-1);
        Mdc2.mdc2(4,-33);
        Mdc2.mdc2(4,0);
    }

    @Test
    public void testMdc2() throws Exception {
        assertEquals(1, Mdc2.mdc2(2,1));
        assertEquals(2,Mdc2.mdc2(4,2));
        assertEquals(3,Mdc2.mdc2(9,3));
        assertEquals(2,Mdc2.mdc2(6,2));
        assertEquals(25,Mdc2.mdc2(75,50));
        assertEquals(100,Mdc2.mdc2(1000,100));
    }
}
