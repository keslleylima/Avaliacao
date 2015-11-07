package br.ufg.inf.es.construcao.quadrado;

/**
 * algoritmo que implementa o calculo do quadrado perfeito de um n�mero;
 */
public class QuadradoPerfeito {
    /**
     *
     * @param k valor  entrada que deseja descobrir se � um quadrado perfeito;
     * @return valor booleana ( true = k � quadrado perfeito,false = k n�o �
     * um quadrado perfeito);
     * IllegalArgumentException caso k n�o atenda a condi��o(k >= 1);
     *  q � a soma de todos primos antecessores a k;
     *   if (q == k) se q == k  o n�mero � um quadrado perfeito;
     *
     */
    public static boolean quadradoPerfeito(int k){
        if (k < 1){
            throw new IllegalArgumentException("K inv�lido");
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
