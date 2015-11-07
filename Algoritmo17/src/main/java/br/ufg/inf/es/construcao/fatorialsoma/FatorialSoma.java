package br.ufg.inf.es.construcao.fatorialsoma;

/**
 * implementação do algoritmo que calcula o fatorial de um numero por meio
 * de soma e produto apenas;
 */
public class FatorialSoma {
    /**
     *
     * @param n numero no qual deseja calcular seu fatorial;
     * @return f valor do fatorial do numero(n);
     * IllegalArgumentException caso n seja menor que 1;
     * f = Produto.produto(f,i); fatorial(f) recebe o valor do produto entre
     * f e i que e calculado pela class chamada produto;
     */
    public static int fatorialSoma(int n){
        if (n < 1){
            throw new IllegalArgumentException("n invalido");
        }

        int i = 2;
        int f = 1;

        while (i <=n){
            f = Produto.produto(f,i);
            i = i + 1;
        }

        return f;
    }
}
