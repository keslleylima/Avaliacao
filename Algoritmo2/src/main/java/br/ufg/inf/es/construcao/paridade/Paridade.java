package br.ufg.inf.es.construcao.paridade;

/**
 * algoritmo para determina a paridade de um n�mero qualquer
 */
public class Paridade {
    /**
     *
     * @param n numero que deseja descobrir sua paridade;
     * @return valor booleano( n � ou n�o par);
     * if(n % 2 == 0) caso condi��o seja atendida o n�mero � par;
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
