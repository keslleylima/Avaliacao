package br.ufg.inf.es.construcao.ackerman;

/**
 *Algoritmo implementa a fun��o de ACkerman Fun��o de Ackermann fun��o essa
 * quemostra que nem toda fun��o total-comput�vel � recursiva primitiva;
 */
public class Ackerman {
    /**
     *
     * @param x Primeiro valor de entrada(>= 0);
     * @param y Segundo valor de entrada (>= 0);
     * @return o valor da aplicac�o dessa fun��o nos n�meiros inteiros;
     *  IllegalArgumentException caso:
     *  x seja negativo;
     *  y seja negativo;
     */
    public static int ackerman(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inv�lido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inv�lido");
        }

        if (x == 0) {
            return y + 1;
        }

        if (y == 0) {
            return ackerman(x - 1, 1);
        }

        return ackerman(x - 1, ackerman(x, y - 1));
    }
}

