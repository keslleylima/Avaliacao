package br.ufg.inf.es.construcao.polsimples;

/**
 * algoritmo que implementa o c�lculo do polinomio simples;
 */
public class PolSimples {
    /**
     *
     * @param x n�mero de elmentos inteiros;
     * @param g inidce do vetor;
     * @param a vetor que armazena os x n�meros;
     * @return p valor do polinomio;
     * IllegalArgumentException caso n�o atenda as condicoes:
     * tamanho do vetor >= indice do vetor + 1;
     * todos elementos do vetor devem ser diferente de 0;
     * o indice do vetor(g) deve ser igual ou maior que 1;
     * var�avel de controle do loop: i;
     * Uso da class pot�ncia para obter a potencia entre x ,g e x,i;
     *
     */
    public static int polSimples(int x,int g,int[]a){
    if (a.length < g+1){
        throw new IllegalArgumentException("tamanho do vetor inv�lido");
    }

    if (a[g] == 0){
        throw new IllegalArgumentException("vetor inv�lido");
    }

    if (g < 1){
        throw new IllegalArgumentException("g inv�lido");
    }

    int t = Potencia.potencia(x,g);
    int p = a[0];
    int i = 1;

    while (i <= g){
        t = Potencia.potencia(x,i);
        p = p + (a[i] * t);
        i= i + 1;
    }

        return p;
    }
}
