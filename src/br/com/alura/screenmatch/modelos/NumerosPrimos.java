package br.com.alura.screenmatch.modelos;

public class NumerosPrimos {
    public boolean verficiarNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return  true;
    }

    public void listarPrimos(int limiteSuperior) {
        System.out.println("Números primos até " + limiteSuperior + ": ");
        for (int i = 2; i <= limiteSuperior; i++) {
            if (verficiarNumeroPrimo(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}


