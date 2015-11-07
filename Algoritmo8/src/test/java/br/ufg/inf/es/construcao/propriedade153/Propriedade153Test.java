package br.ufg.inf.es.construcao.propriedade153;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class Propriedade153Test {

    @Test(expected = IllegalArgumentException.class)
    public void test1ParametroInvalido() throws Exception {
        Propriedade153.propriedade153((-56545477));
        Propriedade153.propriedade153((1000));
    }

    @Test
    public void testPro153()  {
        assertTrue(Propriedade153.propriedade153(153));
        assertTrue(Propriedade153.propriedade153(371));
    }

    @Test
    public void testNaoPro153()  {
        assertFalse(Propriedade153.propriedade153(154));
        assertFalse(Propriedade153.propriedade153(247));
        assertFalse(Propriedade153.propriedade153(999));
    }
}
