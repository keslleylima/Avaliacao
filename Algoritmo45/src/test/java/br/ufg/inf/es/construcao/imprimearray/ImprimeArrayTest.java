package br.ufg.inf.es.construcao.imprimearray;

import org.junit.Test;
import static org.junit.Assert.*;

public class ImprimeArrayTest {

    @Test(expected = IllegalArgumentException.class)
    public void testTamanhoVetorInvalido() {
        ImprimeArray.imprimeArray(new char[2], 3);
        ImprimeArray.imprimeArray(new char[1], 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testParametroNinvalido() {
        ImprimeArray.imprimeArray(new char[4], -1);
    }


    @Test
    public void testImprimeArray() {
        char[] A = {'K', 'E', 'S', 'L', 'L','E','Y'};
        ImprimeArray.imprimeArray(A,7);
    }

    @Test
    public void testImprimeArray2(){
        char[] B = {'1', '4', '0', '8', '9','6'};
        ImprimeArray.imprimeArray(B,6);
    }
    }


