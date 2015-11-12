package br.ufg.inf.es.construcao.primo;

/**
 * programa que determina se um número e ou nao primo;
 */
public class Primo {
    /**
     *
     * @param n número que deseja saber se é ou não primo;
     * @thorws IllegalArgumentException caso n nao atenda a condição;
     *while (i <= (n-1) loop para dividir n por todos seus
     *antecessores,ou seja, de 2 ate n-1;
     *caso ele seja divísivel por algume além dele mesmo ele entra
     *no if(n % i == 0) retornando false, nao sendo primo;
     *variável i inicia com 2, pois todos são divisiveis por 1;
     *sendo assim i deve ser maior que 1;
     * @return valor booleano true ( número primo),false(não primo);
     */
    public  static boolean primo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("N NÃO É VÁLIDO");
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
