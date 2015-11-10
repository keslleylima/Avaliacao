package br.ufg.inf.es.construcao.equacao;

/**
 * algoritmo que implementa o c�lculo do n�mero poss�vel de solu��es para a
 * soluc�o 2x + 3y + 5z + 7w = 210;
 */
public class Equacao {
    /**
     *
     * @return s, a quantidade de solu��es poss�veis para a equa��o:
     * 2x + 3y + 5z + 7w = 210;
     * x varia de 1 a 96;
     * y varia de 1 a 65;
     * z varia de i a 39;
     * y varia de 1 a 28;
     */
    public static int equacao() {
        int s = 0; // Conta as solu��es;
        int x = 1;

        while (x <= 96) {
            int y = 1;

            while (y <= 65) {
                int z = 1;

                while (z <= 39) {
                    int w = 1;

                    while (w <= 28) {
                        if (2 * x + 3 * y + 5 * z + 7 * w == 210) {
                            s = s + 1;
                        }

                        w = w + 1;
                    }

                    z = z + 1;
                }

                y = y + 1;
            }

            x = x + 1;
        }

        return s;
    }
}

