package br.ufg.inf.es.construcao.dividesubtracoes;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideSubtracoesTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido(){
        DivideSubtracoes.divideSubtracoes(-2, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido() {
        DivideSubtracoes.divideSubtracoes(0, 0);
        DivideSubtracoes.divideSubtracoes(2, -33);
    }

    @Test
    public void testDivideSoma() throws Exception {
        assertEquals(1,DivideSubtracoes.divideSubtracoes(1, 1));
        assertEquals(2,DivideSubtracoes.divideSubtracoes(2, 1));
        assertEquals(1,DivideSubtracoes.divideSubtracoes(3, 2));
        assertEquals(2,DivideSubtracoes.divideSubtracoes(10, 5));

    }
}