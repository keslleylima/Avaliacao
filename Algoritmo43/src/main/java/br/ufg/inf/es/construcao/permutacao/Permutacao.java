package br.ufg.inf.es.construcao.permutacao;

import java.util.List;

/**
 * Algoritmo que implementa o cálculo de permutação de um conjunto;
 */
public class Permutacao {

    public static List<String> permutacao(String prefixo,String conjunto,List<String> resultadoParcial) {
    if (conjunto.length() == 1){
        resultadoParcial.add(prefixo + conjunto);
        return resultadoParcial;
    }
    for (int i = 0; i < conjunto.length();i++){
        char cI = conjunto.charAt(i);

        StringBuilder sLinha= new StringBuilder(conjunto);
        sLinha.deleteCharAt(i);

        String pLinha = prefixo + cI;

        permutacao(pLinha,sLinha.toString(),resultadoParcial);

    }
        return resultadoParcial;
    }
}
