package br.ufg.inf.es.construcao.paridade;

/**
 * algoritmo para determina a paridade de um número qualquer
 */
public class Paridade {
    /**
     *
     * @param n numero que deseja descobrir sua paridade;
     * @return valor booleano( n é ou não par);
     * if(n % 2 == 0) caso condição seja atendida o número é par;
     * else para quando o resto do n dividido por 2 seja diferente de 0(impar);
     */
    public static boolean paridade (int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
