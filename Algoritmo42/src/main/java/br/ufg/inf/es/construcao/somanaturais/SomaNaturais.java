package br.ufg.inf.es.construcao.somanaturais;

/**
 * Algoritmo que implementa o cálculo de soma dos números naturais;
 */
public class SomaNaturais {
    /**
     *
     * @param n , os primeiros n termos naturais a serem somados;
     * @return 1 caso tenha apenas 1 termo que no caso é o próprio 1;
     * caso n não seja 1 ele vai retorna a soma dos n-1 +n;
     * @throws IllegalArgumentException caso n seja menor 1;
     */
    public static int somaNaturais(int n){
        if (n < 1){
            throw new IllegalArgumentException("N inválido");
        }

        if (n == 1){
            return 1;
        }

        return somaNaturais(n-1) + n;
    }
}
