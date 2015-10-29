package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Created by alunoinf on 29/10/15.
 */
public class DiaDaSemana {
    /**
     *
     * @param d dia da data;
     * @param m mes da data;
     * @param a ano da data;
     * @return valor s representa dia da semana daquela data;
     * s retorna 0 a 6 (0 segunda 1 terca 2-quarta ...);
     * @throws IllegalArgumentException caso dia,mes ou ano invalido;
     * O dia deve ser maior que 1 e menor que 31;
     * o mes deve ser maior que 1 e menor que 12;
     * o ano deve ser maior que 1753;
     */
    public static int diaDaSemana(int d, int m, int a) {
        if (d < 1 || d > 31 ) {
            throw new IllegalArgumentException("dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException("mes invalido");
        }

        if (a < 1753) {
            throw new IllegalArgumentException("ano inválido");
        }

        if (m == 1 || m == 2) {
            m = m + 12;
            a = a - 1;
        }

        int s = d + 2 * m + 3 * (m + 1) / 5 + a + a / 4 - a / 100 + a / 400;

        return (s % 7);
    }
}
