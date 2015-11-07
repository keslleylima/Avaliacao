package br.ufg.inf.es.construcao.produto;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test(expected = IllegalArgumentException.class)
    public void PrimeiraValorEntradaInvalido() {
        Produto.produto(-1,1);
        Produto.produto(-222,93);
    }
    @Test(expected = IllegalArgumentException.class)
    public void SegundoValorEntradaInvalido() {
        Produto.produto(1,-22);
        Produto.produto(3,-33);
    }
    @Test
    public void testProduto() throws Exception {
        Assert.assertEquals(6,Produto.produto(2,3));
        Assert.assertEquals(12,Produto.produto(4,3));
        Assert.assertEquals(20,Produto.produto(5,4));
        Assert.assertEquals(20,Produto.produto(4,5));
    }
}