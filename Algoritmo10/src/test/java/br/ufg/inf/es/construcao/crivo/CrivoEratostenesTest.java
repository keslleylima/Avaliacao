package br.ufg.inf.es.construcao.crivo;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class CrivoEratostenesTest {

    @Test(expected = IllegalArgumentException.class)
    public void testValorNInvalido() {
        CrivoEratostenes.crivoEratostenes(null, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testVetorTamanhoInvalido() {
        CrivoEratostenes.crivoEratostenes(new int[]{2}, 3);
    }

    @Test
    public void testDoisPrimo() {
        int[] a = {1, 2, 0};
        CrivoEratostenes.crivoEratostenes(a, 2);
        Assert.assertEquals(0, a[2]);
    }

    @Test
    public void test50NaoPrimo() {
        int[] a = new int[51];
        CrivoEratostenes.crivoEratostenes(a,50);
        Assert.assertEquals(1, a[50]);
        Assert.assertEquals(0, a[17]);
        Assert.assertEquals(1, a[33]);
        Assert.assertEquals(0, a[41]);
        Assert.assertEquals(1, a[45]);
        Assert.assertEquals(0, a[5]);
    }

}
