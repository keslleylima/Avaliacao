package br.ufg.inf.es.construcao.primo;

/**
 * programa que determina se um n�mero e ou nao primo;
 */
public class Primo {
    /**
     *
     * @param n n�mero que deseja saber se � ou n�o primo;
     *          IllegalArgumentException caso n nao atenda a condi��o;
     *          while (i <= (n-1) loop para dividir n por todos seus
     *          antecessores,ou seja, de 2 ate n-1;
     *          caso ele seja div�sivel por algume al�m dele mesmo ele entra
     *          no if(n % i == 0) retornando false, nao sendo primo;
     *          vari�vel i inicia com 2, pois todos s�o divisiveis por 1;
     *          sendo assim i deve ser maior que 1;
     * @return
     */
    public  static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("N N�O � V�LIDO");
        }

        int i = 2;

        while (i <= (n-1)) {
            if(n % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }
}