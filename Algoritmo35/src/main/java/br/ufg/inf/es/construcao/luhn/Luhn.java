package br.ufg.inf.es.construcao.luhn;

/**
 * algoritmo Luhn ou f�rmula Luhn, � uma simples soma de verifica��o f�rmula
 * utilizada para validar uma variedade de n�meros de identifica��o, como
 * cart�o de cr�dito e outros;
 */
public class Luhn {

    public static int luhn(int n[]){
        int k = n.length;

        if (k < 2){
            throw new IllegalArgumentException("k inv�lido");
        }

        int i = 0; // acumula parcelas impares;
        int p = 0; // acumula parcelas pares;
        int l = k - 1; // remove d�gito verificador do c�mputo;
        boolean a = false;

        while (l > 0){
            if(a) {
                p = p + n[l]; //acumula dig�tos pares;
            }else {
                int t = n[l] * 2 ; // dobro do elemento de ordem �mpar;
                i = i + (t / 10) + Mod.mod(t,10); // acumula d�gitos de t;
            }

            l = l - 1;
            a = !a;
        }

        return 10- Mod.mod(i + p,10);
    }
}
