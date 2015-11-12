package br.ufg.inf.es.construcao.propriedade;

/**
 * Algoritmo que verifica quantos números atende a propriedade Soma
 * dos fatorias dos dígitos de n é igual a ele;
 */
public class Propriedade {
    /**
     * verifica a propriedade;
     * @return quantidade de números que atendem a propriedade;
     */
    public static int propriedade(){
        int t = 0;
        int n = 0;

        while (n < 1000){
            if (SomaFat.verifica(n)){
                t = t + 1;
            }
            n = n + 1;
        }

        return t;
    }
}
