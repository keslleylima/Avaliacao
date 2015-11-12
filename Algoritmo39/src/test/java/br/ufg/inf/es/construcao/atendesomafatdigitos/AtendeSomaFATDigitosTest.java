package br.ufg.inf.es.construcao.atendesomafatdigitos;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class AtendeSomaFATDigitosTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() throws Exception{
        AtendeSomaFATDigitos.verifica(-1);
        AtendeSomaFATDigitos.verifica(100000);
    }

    @Test
    public void testCasoTrue() {
        assertTrue(AtendeSomaFATDigitos.verifica(145));
    }

    @Test
    public void testCasoFalse() {
       assertFalse(AtendeSomaFATDigitos.verifica(144));
        assertFalse(AtendeSomaFATDigitos.verifica(174));
    }
}