package br.ufg.inf.es.construcao.atendesomafatdigitos;

/**
 * Algoritmo que implementa a verifica��o se a soma dos fatorias dos digitos
 * de um inteiro n, sendo ele maior que 0 � igual a esse n�mero;
 */
public class AtendeSomaFATDigitos {

    /**
     *
     * @param n N�mero que ser� verificado;
     *O par�metro n deve ser maior que -1 e menor que 1000.
     * IllegalArgumentException caso n n�o atenda a condi��o de entrada;
     * caso contr�rio.
     * return true caso o n�mero seja igual a soma dos fatoriais dos seus
     * digitos e retorna false caso ele n�o seja igual;
     * uso da class fatorial para determinar valor do fatorial de cada digito de n;
     *
     */
    public static boolean verifica(int n) {
        if (n < 0 || n >= 1000) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int a = n / 100;
        int b = (n - 100 * a) / 10;
        int c = n % 10;
        int s = Fatorial.fatorial(a) + Fatorial.fatorial(b) +
                Fatorial.fatorial(c);

        if (s == n) {
            return true;
        } else {
            return false;
        }
    }
}
