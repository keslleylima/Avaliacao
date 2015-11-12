package br.ufg.inf.es.construcao.permutacao;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class PermutacaoTest {

    @Test
    public void testOutroCasoTrivial() {
        List<String> retorno = Permutacao.permutacao("", "AB", new ArrayList<String>());
        Assert.assertEquals(2, retorno.size());
        Assert.assertTrue(retorno.contains("AB"));
        Assert.assertTrue(retorno.contains("BA"));
    }

    @Test
    public void testCasoTrivial() {
        List<String> retorno = Permutacao.permutacao("", "k", new ArrayList<String>());
        Assert.assertEquals(1, retorno.size());
        Assert.assertEquals("k", retorno.get(0));
    }


    @Test
    public void testNaoTrivial() {
        List<String> retorno = Permutacao.permutacao("", "Keslley", new ArrayList<String>());
        Assert.assertEquals(5040,retorno.size());
    }
}