package br.ufg.inf.es.construcao.divide;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivideTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiroParametroInvalido() {
        Divide.divide(0,2,0);
        Divide.divide(-2,3,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void SegundoParametroInvalido(){
        Divide.divide(1,0,0);
        Divide.divide(2,-1,-1);
    }
}