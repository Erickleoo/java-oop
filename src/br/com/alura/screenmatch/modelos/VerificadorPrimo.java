package br.com.alura.screenmatch.modelos;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificarSeEhPrimo(int numero) {
        if (verficiarNumeroPrimo(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
