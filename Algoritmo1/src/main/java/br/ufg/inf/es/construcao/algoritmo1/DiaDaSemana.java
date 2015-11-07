package br.ufg.inf.es.construcao.algoritmo1;

/**
 * Implementação do algoritmo que obtém o dia da semana de uma data qualquer.
 */
public class DiaDaSemana {

    /**
     *
     * @param d dia da data;
     * @param m Mês da data;
     * @param a ano da data;
     * @return valor s representa dia da semana daquela data;
     * s retorna 0 a 6 (0 segunda 1 terca 2-quarta ...);
     * @throws IllegalArgumentException caso dia,mês ou ano inválido;
     * O dia deve ser maior que 1 e menor que 31;
     * o mês deve ser maior que 1 e menor que 12;
     * o ano deve ser maior que 1753;
     */
    public static int diaDaSemana(int d, int m, int a) {
        if (d < 1 || d > 31 ) {
            throw new IllegalArgumentException("dia inválido");
        }

        if (m < 1 || m > 12) {
            throw new IllegalArgumentException(" mês inválido");
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
