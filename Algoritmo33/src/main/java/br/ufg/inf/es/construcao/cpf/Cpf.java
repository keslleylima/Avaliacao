package br.ufg.inf.es.construcao.cpf;

/**algoritmo que implementa a verificação da validade da sequência de 11 digitos
 * do cpf;
 */
public class Cpf {
    /**
     *
     * @param d vetor
     * @return valor booleano retorna true = cpf váldio false= cpf inválido;
     * @throws IllegalArgumentException caso :
     * tamanho do vetor seja menor que 12( d.length deve ser >= 12);
     * d[i] < 0 || d[i] > 9),ou seja, caso alguma posição do vetor tenha
     * um número maior que 9 ou menor que 0;
     * digitos válidos d[1] até d[11];
     *
     */
    public static boolean cpf(int [] d){
        if (d.length < 12){
            throw new IllegalArgumentException("Tamanho do vetor Inválido");
        }

        for(int i = 1;i <12;i++) {
            if (d[i] < 0 || d[i] > 9) {
                throw new IllegalArgumentException("Número Inválido");
            }
        }

            int sj = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5]
                    + 6 * d[6] + 7 * d[7] + 8 * d[8] + 9 * d[9];
            int sk = d[2] + 2 * d[3] + 3 * d[4] + 4 * d[5] + 5 * d[6]
                    + 6 * d[7] + 7 * d[8] + 8 * d[9] + 9 * d[10];

            int j = Mod.mod(Mod.mod(sj, 11), 10);
            int k = Mod.mod(Mod.mod(sk, 11), 10);

            if (j == d[10] && k == d[11]){
                return true;
            }else {
                return false;
            }
    }
}

