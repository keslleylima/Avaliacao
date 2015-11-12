package br.ufg.inf.es.construcao.cpf;

/**
 * Classe que implementa o mod entre x e y;
 */
public class Mod {
    /**
     *
     * @param x primeiro valor entrada,deve ser maior que 0;
     * @param y segundo valor entrada,deve ser maior ou igual a 0;
     * @return s valor do resto da divisão entre x e y;
     * @throws IllegalArgumentException caso x ou y não atenda as condições;
     *
     */
    public static int mod(int x,int y){
        if (x <= 0){
            throw new IllegalArgumentException("x inválido");
        }

        if (y < 0){
            throw new IllegalArgumentException("y inválido");
        }
        
        int s = x;
        while (s >= y){
            s = s - y;
        }

        return s;
    }
}
