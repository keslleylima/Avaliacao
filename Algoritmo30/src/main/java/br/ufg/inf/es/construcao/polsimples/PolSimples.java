package br.ufg.inf.es.construcao.polsimples;

/**
 * algoritmo que implementa o cálculo do polinomio simples;
 */
public class PolSimples {
    /**
     *
     * @param x número de elmentos inteiros;
     * @param g inidce do vetor;
     * @param a vetor que armazena os x números;
     * @return p valor do polinomio;
     * IllegalArgumentException caso não atenda as condicoes:
     * tamanho do vetor >= indice do vetor + 1;
     * todos elementos do vetor devem ser diferente de 0;
     * o indice do vetor(g) deve ser igual ou maior que 1;
     * varíavel de controle do loop: i;
     * Uso da class potência para obter a potencia entre x ,g e x,i;
     *
     */
    public static int polSimples(int x,int g,int[]a){
    if (a.length < g+1){
        throw new IllegalArgumentException("tamanho do vetor inválido");
    }

    if (a[g] == 0){
        throw new IllegalArgumentException("vetor inválido");
    }

    if (g < 1){
        throw new IllegalArgumentException("g inválido");
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
