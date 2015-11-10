package br.ufg.inf.es.construcao.cpf;

import org.junit.Test;
import static org.junit.Assert.*;

public class CpfTest {

    @Test(expected = IllegalArgumentException.class)
    public void ValoresInvalido() {
        int vetor1[] = {7,0,2,2,9,2,1,3,1,8,-9};
        int vetor2 [] = {3,3,2,2,2,2,-2,-1,2,1};
        Cpf.cpf(vetor1);
        Cpf.cpf(vetor2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void TamanhoVetorInvalido() {
       int vetor [] = new int[10];
        int vetor2 [] = new int[12];
        Cpf.cpf(vetor2);
        Cpf.cpf(vetor);
    }

    @Test
    public void TestCPFvalido() throws Exception {
        int[] cpf = {0, 4, 6, 4, 5, 0, 7, 1, 8, 1, 5, 3};
        assertTrue(Cpf.cpf(cpf));
    }

    @Test
    public void TestCPFInvalido() throws Exception {
        int[] cpf2 = {7,0,2,2,9,2,1,3,1,8,9,2};
        assertFalse(Cpf.cpf(cpf2));
    }
}