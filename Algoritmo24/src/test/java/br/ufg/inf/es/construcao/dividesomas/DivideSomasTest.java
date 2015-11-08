package br.ufg.inf.es.construcao.dividesomas;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSomasTest {
    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido(){
        DivideSomas.divideSoma(-2,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        DivideSomas.divideSoma(0,0);
        DivideSomas.divideSoma(2,-33);
    }

    @Test
    public void testDivideSoma() throws Exception {
        assertEquals(1,DivideSomas.divideSoma(1,1));
        assertEquals(2,DivideSomas.divideSoma(2,1));
        assertEquals(1,DivideSomas.divideSoma(3,2));
        assertEquals(2,DivideSomas.divideSoma(10,5));

    }
}