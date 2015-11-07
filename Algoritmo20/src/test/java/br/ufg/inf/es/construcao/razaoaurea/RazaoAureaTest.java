package br.ufg.inf.es.construcao.razaoaurea;

import org.junit.Test;
import static org.junit.Assert.*;

public class RazaoAureaTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        RazaoAurea.razaoAurea(-1,2,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParemetroInvalido() {
        RazaoAurea.razaoAurea(1,1,1);
        RazaoAurea.razaoAurea(3,2,2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TerceiroParametroInvalido() {
        RazaoAurea.razaoAurea(1,2,-1);
    }

    @Test
    public void testRazaoAurea121() throws Exception {
    assertEquals(1.5,RazaoAurea.razaoAurea(1,2,1),0.01);
    }

    @Test
    public void testRazaoAurea232() throws Exception {
        assertEquals(1.66,RazaoAurea.razaoAurea(2,3,1),0.01);
    }
}