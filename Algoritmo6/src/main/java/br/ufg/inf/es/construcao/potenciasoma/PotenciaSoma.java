package br.ufg.inf.es.construcao.potenciasoma;

/**
 * Implementa��o de algoritmo que calcula a pot�ncia de um n�mero x em um
 * expoente y, utilizando apenas multiplica��es simples;
 */
public class PotenciaSoma {
    /**
     *
     * @param x n�mero maior que 0;
     * @param y n�mero maior ou igual a 1;
     * @return p resultado da pot�ncia entre x e y;
     * IllegalArgumentException  caso x ou y nao atenda as condi��es do loop;
     * p = Produto.produto(p,x); chama a classe que efetua o produto que �
     * recebido por p;
     * vari�vel de controle no loop : i;
     */
    public static int potenciaSoma(int x,int y) {
        if (x <= 0) {
        throw new IllegalArgumentException("x invalido");
        }

        if (y < 1) {
            throw new IllegalArgumentException("y invalido");
        }

        int i = 1;
        int p = x;

        while (i < y) {
            p = Produto.produto(p,x);
            i = i + 1;
        }

        return p;
    }
}
