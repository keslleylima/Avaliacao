package br.ufg.inf.es.construcao.propriedade;

/**
 * Algoritmo que verifica quantos n�meros atende a propriedade Soma
 * dos fatorias dos d�gitos de n � igual a ele;
 */
public class Propriedade {

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
