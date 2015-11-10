package br.ufg.inf.es.construcao.equacao;

import org.junit.Test;
import static org.junit.Assert.*;

public class EquacaoTest {

    @Test
    public void testEquacao() throws Exception {
        assertEquals(6489, Equacao.equacao());
    }
}