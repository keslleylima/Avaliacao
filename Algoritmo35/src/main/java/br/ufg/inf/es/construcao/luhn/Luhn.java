package br.ufg.inf.es.construcao.luhn;

/**
 * algoritmo Luhn ou fórmula Luhn, é uma simples soma de verificação fórmula
 * utilizada para validar uma variedade de números de identificação, como
 * cartão de crédito e outros;
 */
public class Luhn {

    public static int luhn(int n[]){
        int k = n.length;

        if (k < 2){
            throw new IllegalArgumentException("k inválido");
        }

        int i = 0; // acumula parcelas impares;
        int p = 0; // acumula parcelas pares;
        int l = k - 1; // remove dígito verificador do cômputo;
        boolean a = false;

        while (l > 0){
            if(a) {
                p = p + n[l]; //acumula digítos pares;
            }else {
                int t = n[l] * 2 ; // dobro do elemento de ordem ímpar;
                i = i + (t / 10) + Mod.mod(t,10); // acumula dígitos de t;
            }

            l = l - 1;
            a = !a;
        }

        return 10- Mod.mod(i + p,10);
    }
}
