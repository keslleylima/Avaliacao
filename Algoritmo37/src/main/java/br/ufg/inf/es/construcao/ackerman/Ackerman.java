package br.ufg.inf.es.construcao.ackerman;

/**
 *Algoritmo implementa a função de ACkerman Função de Ackermann função essa
 * quemostra que nem toda função total-computável é recursiva primitiva;
 */
public class Ackerman {
    /**
     *
     * @param x Primeiro valor de entrada(>= 0);
     * @param y Segundo valor de entrada (>= 0);
     * @return o valor da aplicacão dessa função nos númeiros inteiros;
     * @throws IllegalArgumentException caso:
     *  x seja negativo;
     *  y seja negativo;
     */
    public static int ackerman(int x, int y) {
        if (x < 0) {
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0) {
            throw new IllegalArgumentException("y inválido");
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

