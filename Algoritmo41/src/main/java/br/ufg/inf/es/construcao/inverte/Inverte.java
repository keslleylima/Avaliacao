package br.ufg.inf.es.construcao.inverte;

/**
 * algoritmo que implementa a inversão de caracteres;
 */
public class Inverte {
    /**
     * @param k array que contém a sequência de caracteres;
     * @return kx , array com sequência contrária de caracteres
     * em relação ao arrray k (parametro de entrada);
     * if (k.length == 1) signifca que possui apenas 1 caracter;
     */
    public static char[] inverter(char[] k) {
        if (k.length == 1) {
            return k;
        } else {
            int i = k.length - 1;
            char[]kx = new char[k.length];
            while (i >= 0) {
                kx[i] = k[(k.length - i) - 1];
                i = i - 1;
            }
            return kx;
        }
    }
}