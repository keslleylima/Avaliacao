package br.ufg.inf.es.construcao.polsimples;

import org.junit.Test;
import static org.junit.Assert.*;

public class PolSimplesTest {
    @Test(expected = IllegalArgumentException.class)
    public void ParametroGInvalido(){
        int []vetor  = {1,2,3,4,5};
        PolSimples.polSimples(0,1,vetor);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ParametroTamanhoVetorInvalido(){
        int []vetor  = {1,2,3,4,5};
        PolSimples.polSimples(0,0,vetor);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ParametroElementoVetorInvalido(){
        int []vetor  = {1,2,3,4,5,0};
        PolSimples.polSimples(2,6,vetor);
    }
    
    @Test
    public void testPolSimples() throws Exception {
        int []vetor = {1,2,3,4,5};
        assertEquals(6,PolSimples.polSimples(1,2,vetor));
        assertEquals(34,PolSimples.polSimples(3,2,vetor));
        assertEquals(17,PolSimples.polSimples(2,2,vetor));

    }
}
