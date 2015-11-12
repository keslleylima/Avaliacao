package br.ufg.inf.es.construcao.somanaturais;

/**
 * Algoritmo que implementa o c�lculo de soma dos n�meros naturais;
 */
public class SomaNaturais {
    /**
     *
     * @param n , os primeiros n termos naturais a serem somados;
     * @return 1 caso tenha apenas 1 termo que no caso � o pr�prio 1;
     * caso n n�o seja 1 ele vai retorna a soma dos n-1 +n;
     * @throws IllegalArgumentException caso n seja menor 1;
     */
    public static int somaNaturais(int n){
        if (n < 1){
            throw new IllegalArgumentException("N inv�lido");
        }

        if (n == 1){
            return 1;
        }

        return somaNaturais(n-1) + n;
    }
}
