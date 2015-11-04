package br.ufg.inf.es.construcao.paridade;

import org.junit.Assert;
import org.junit.Test;

public class ParidadeTest {

    @Test
    public void testPar() throws Exception {
        Assert.assertTrue(Paridade.paridade(2));
        Assert.assertTrue(Paridade.paridade(-2));
        Assert.assertTrue(Paridade.paridade(6));
        Assert.assertTrue(Paridade.paridade(300));
        Assert.assertTrue(Paridade.paridade(200));
        Assert.assertTrue(Paridade.paridade(-2000));
    }

    @Test
    public void testImpar() throws Exception {
        Assert.assertFalse(Paridade.paridade(3));
        Assert.assertFalse(Paridade.paridade(33));
        Assert.assertFalse(Paridade.paridade(-7));
        Assert.assertFalse(Paridade.paridade(555));
        Assert.assertFalse(Paridade.paridade(1));
        Assert.assertFalse(Paridade.paridade(-1));
        Assert.assertFalse(Paridade.paridade(777));

    }
}