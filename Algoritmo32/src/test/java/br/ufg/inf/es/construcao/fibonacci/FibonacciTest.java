package br.ufg.inf.es.construcao.fibonacci;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest {
    @Test(expected = IllegalArgumentException.class)
    public void ParametroInvalido() {
        Fibonacci.fibonacci(-2);
    }

    @Test
    public void testFibonacci4() throws Exception {
    assertEquals(3,Fibonacci.fibonacci(4));
    }

    @Test
    public void testFibonacci9() throws Exception {
        assertEquals(34,Fibonacci.fibonacci(9));
    }

    @Test
    public void testFibonacci11() throws Exception {
        assertEquals(89,Fibonacci.fibonacci(11));
    }

}