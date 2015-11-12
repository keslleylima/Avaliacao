package br.ufg.inf.es.construcao.lognaturalsimples;

/**
 * algoritmo que implementa o cálculo do log-natural-siimples em n,k;
 */
public class LogNaturalSimples {
   /**
     * verifica log natural;
     * @param n inteiro que serão verificado;
     * @param k grau de precisao do log;
     * @return valor do logaritmo;
     */
    public static double logNaturalSimples(int n,int k) {
     if (n < 1){
         throw new IllegalArgumentException("n inválido");
     }

     if (k < 2){
         throw new IllegalArgumentException("k inválido");
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
