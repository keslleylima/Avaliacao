package br.ufg.inf.es.construcao.potenciasoma;

/**
 * Implementação de algoritmo que calcula a potência de um número x em um
 * expoente y, utilizando apenas multiplicações simples;
 */
public class PotenciaSoma {
    /**
     *
     * @param x número maior que 0;
     * @param y número maior ou igual a 1;
     * @return p resultado da potência entre x e y;
     * IllegalArgumentException  caso x ou y nao atenda as condiçôes do loop;
     * p = Produto.produto(p,x); chama a classe que efetua o produto que é
     * recebido por p;
     * variável de controle no loop : i;
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
