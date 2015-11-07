package br.ufg.inf.es.construcao.razaoaurea;

/**
 * implementacao do algoritmo que realiza o c�lculo da raz�o �urea;
 */
public class RazaoAurea {
    /**
     *
     * @param t1 primeiro valor entrada corresponde ao termo corrente;
     * @param t2 segundo valor entrada corresponde ao termo anterior;
     * @param fator fator para a determinada raz�o �urea;
     * @return tc+ta/tc-ta,ou seja, tc/ta;
     * IllegalArgumentException caso algum dos parametros nao atenda as condi��es;
     * variavel de controle do loop: i;
     */
    public static double razaoAurea(int t1,int t2,int fator){
    if (t1 <= 0){
        throw new IllegalArgumentException("t1 invalido");
    }

    if (t2 <= t1){
        throw new IllegalArgumentException("t2 invalido");
    }

    if (fator <= 0){
        throw new IllegalArgumentException("fator invalido");
    }

    double tc = t2;
    double ta = t1;
    int i = 1;

    while (i <= fator){
        tc = tc + ta;
        ta = tc - ta;
        i = i + 1;
    }

        return tc/ta;
    }
}

