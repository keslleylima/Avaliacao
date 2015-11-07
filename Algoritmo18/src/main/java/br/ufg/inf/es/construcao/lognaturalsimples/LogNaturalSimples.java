package br.ufg.inf.es.construcao.lognaturalsimples;

/**
 * algoritmo que implementa o c�lculo do log-natural-siimples em n,k;
 */
public class LogNaturalSimples {

    public static double logNaturalSimples(int n,int k) {
     if (n < 1){
         throw new IllegalArgumentException("n inv�lido");
     }

     if (k < 2){
         throw new IllegalArgumentException("k inv�lido");
     }

     int i = 2;
     double e = n + 1;

     while (i <= k){
     double p = Potencia.potencia(n,i);
     double f = Fatorial.fatorial(i);
     e = e + p / f;
     i = i + 1;
     }

        return e;
    }

}
