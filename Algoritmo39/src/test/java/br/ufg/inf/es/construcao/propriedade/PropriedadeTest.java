package br.ufg.inf.es.construcao.propriedade;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PropriedadeTest {
    /**
     * O teste do algoritmo não pode ser implantado, já que no algoritmo n
     * recebe 0 e quando a class SomaFat entra no if ela utiliza a class
     * fatorial que não permite parametro n menor que 1.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testPropriedade() throws Exception {
        Propriedade.propriedade();
    }
}