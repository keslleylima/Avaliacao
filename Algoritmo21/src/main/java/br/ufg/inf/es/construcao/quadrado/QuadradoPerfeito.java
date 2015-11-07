package br.ufg.inf.es.construcao.quadrado;

/**
 * algoritmo que implementa o calculo do quadrado perfeito de um número;
 */
public class QuadradoPerfeito {
    /**
     *
     * @param k valor  entrada que deseja descobrir se é um quadrado perfeito;
     * @return valor booleana ( true = k é quadrado perfeito,false = k não é
     * um quadrado perfeito);
     * IllegalArgumentException caso k não atenda a condição(k >= 1);
     *  q é a soma de todos primos antecessores a k;
     *   if (q == k) se q == k  o número é um quadrado perfeito;
     *
     */
    public static boolean quadradoPerfeito(int k){
        if (k < 1){
            throw new IllegalArgumentException("K inválido");
        }

        int i = 1;
        int q = 1;

        while (q < k){
            i = i + 2;
            q = q + i;
        }

        if (q == k){
            return true;
        }else {
         return false;
        }
    }
}
