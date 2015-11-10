package br.ufg.inf.es.construcao.polhorner;

import org.junit.Test;
import static org.junit.Assert.*;

public class PolHornerTest {

    @Test(expected = IllegalArgumentException.class)
    public void ParametroGInvalido() {
        int vetor [] = {1,2,3,4};
        PolHorner.polHorner(vetor,0,4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TamanhoVetorInvalido () {
        int vetor [] = {2,3};
        PolHorner.polHorner(vetor,2,4);
        PolHorner.polHorner(vetor,4,4);
    }

    @Test
    public void testPolHorner() throws Exception {
        int vetor [] = {1,5,7,4};
        assertEquals(71, PolHorner.polHorner(vetor,3,2));
        assertEquals(6,PolHorner.polHorner(vetor,1,1));
    }
}