package br.ufg.inf.es.construcao.amigos;

/**
 *implementa��o do algoritmo que verifica se a soma dos divisores de n e igual
 * a m e se a soma dos divisores de m e igual a n, caso ambos sejam iguais
 * n e m s�o chamados de amigos;
 */
public class Amigos {
    /**
     *
     * @param n n�mero qualquer positivo
     * @param m n�mero qualquer positivo
     * @return valor booleano(true=n e m amigos, false n e m = n�o s�o);
     * IllegalArgumentException caso os valores de entrada n�o atenda
     * a condi��o,ou seja,caso eles sejam igual ou menor que 0;
     * sn = SomaDivisores.somaDivisores(n); sn chama a classe somaDivisores
     * que efetua a soma dos divisores de n,o mesmo acontece com m;
     *
     */
    public static boolean amigos(int n,int m){
    if (n <= 0){
            throw new IllegalArgumentException("n inv�lido");
        }

    if (m <= 0){
        throw new IllegalArgumentException("m inv�lido");
    }

    int sn = SomaDivisores.somaDivisores(n);
    int sm = SomaDivisores.somaDivisores(m);

     if (sn == m && sm == n){
         return true;
     }else {
         return false;
     }
    }
}
