package br.ufg.inf.es.construcao.amigos;

/**
 *implementação do algoritmo que verifica se a soma dos divisores de n e igual
 * a m e se a soma dos divisores de m e igual a n, caso ambos sejam iguais
 * n e m são chamados de amigos;
 */
public class Amigos {
    /**
     *
     * @param n número qualquer positivo
     * @param m número qualquer positivo
     * @return valor booleano(true=n e m amigos, false n e m = não são);
     * IllegalArgumentException caso os valores de entrada não atenda
     * a condição,ou seja,caso eles sejam igual ou menor que 0;
     * sn = SomaDivisores.somaDivisores(n); sn chama a classe somaDivisores
     * que efetua a soma dos divisores de n,o mesmo acontece com m;
     *
     */
    public static boolean amigos(int n,int m){
    if (n <= 0){
            throw new IllegalArgumentException("n inválido");
        }

    if (m <= 0){
        throw new IllegalArgumentException("m inválido");
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
