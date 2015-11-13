package br.ufg.inf.es.construcao.inverte;

/**
 * algoritmo que implementa a invers�o de caracteres;
 */
public class Inverte {
    /**
     * @param k array que cont�m a sequ�ncia de caracteres;
     * @return kx , array com sequ�ncia contr�ria de caracteres
     * em rela��o ao arrray k (parametro de entrada);
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