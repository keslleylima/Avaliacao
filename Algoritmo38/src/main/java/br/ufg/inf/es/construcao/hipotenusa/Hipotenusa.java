package br.ufg.inf.es.construcao.hipotenusa;

/**
 * Implementação do algoritmo que efetua o  calcula da hipotenusa.
 */
public class Hipotenusa {

    /**
     * Cálculo da hipotenusa;
     *
     * @param A valor referente a pimeira medida.
     * @param B valor referente a segunda medida.
     *
     * @return r, valor  da hipotenusa.
     *
     * IllegalArgumentException Caso :
     * O valor de  A deve ser maior que 0.
     * O valor de  B deve ser maior que 0.
     */
    public static double hipotenusa(int a, int b) {
        if (a <= 0) {
            throw new IllegalArgumentException("a inválido");
        }

        if (b <= 0) {
            throw new IllegalArgumentException("b inválido");
        }

        int x = a * a;
        int y = b * b;
        double r = RaizQuadrada.raizQuadrada (x + y, 150);
        return r;
    }
}