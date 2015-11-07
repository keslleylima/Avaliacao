package br.ufg.inf.es.construcao.propriedade153;

/**
 * Verifica a existencia de propriedade 153 em um numero.
 */
public class Propriedade153 {
    /**
     *
     * @param n número positivo entre 0 e 999;
     * @return valor booleano (true o numero possui a propriedade, false
     * o número não possui);
     * IllegalArgumentException caso n não atenda as condições;
     */
    public static boolean propriedade153(int n) {
        if (n < 0 || n > 999) {
            throw new IllegalArgumentException("n inválido");
        }

        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n % 10;

        if (((i * i * i) + (j * j * j) + (k * k * k)) == n) {
            return true;
        }else {
            return false;
        }
    }
}

