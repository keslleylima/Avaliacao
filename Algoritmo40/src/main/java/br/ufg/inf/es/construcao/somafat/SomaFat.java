package br.ufg.inf.es.construcao.somafat;

/**
 * algoritmo que implemnta se a soma dos fatorias do digitos de um número
 * é igual a esse próprio número;
 */
public class SomaFat {
    /**
     *
     * @param n valor de entrada;
     * @return valor boolenao caso true o número atende a propriedade soma
     * fatorial adigitos , caso false o número não atende;
     * uso dad classs Fatorial em a ,b e c (digitos de n);
     *@throws IllegalArgumentException caso n seja menor que 0 e maior ou igual
     * a 1000;
     */
    public  static boolean verifica(int n){
        if (n < 0 || n >= 1000) {
            throw new IllegalArgumentException("n inválido");
        }
        int a = n / 100;
        int b = (n - (100 * a)) / 10;
        int c = n % 10;
        int s = Fatorial.fatorial(a) + Fatorial.fatorial(b) +
                Fatorial.fatorial(c);
        if (s == n){
            return true;
        } else {
            return false;
        }
    }
}
