package br.ufg.inf.es.construcao.propriedade3025;

/**
 * algoritmo que implementa a propriedade 3025;
 */
public class Propriedade3025 {
    /**
     *
     * @param n número positivo entre entre 0 e 9999;
     * @return valor booleano caso true o número possui a propriedade;
     * se retorna false o número não possui;
     * IllegalArgumentException caso valor de entrada não atenda as condições;
     *
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("n invalido");
        }

        float i = n / 100;
        float j = n % 100;

        if (((i + j) * (i+j)) == n){
            return  true;
        }else {
            return false;
        }
    }
}
