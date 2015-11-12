package br.ufg.inf.es.construcao.somanaturais;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        SomaNaturais.somaNaturais(0);
        SomaNaturais.somaNaturais(-33);
    }

    @Test
    public void testSomaNaturais() throws Exception {
        assertEquals(6,SomaNaturais.somaNaturais(3));
        assertEquals(55,SomaNaturais.somaNaturais(10));
        assertEquals(3,SomaNaturais.somaNaturais(2));
    }
}