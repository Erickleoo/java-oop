package br.com.alura.screenmatch.modelos;

public class GeradorPrimo extends NumerosPrimos {
   public int gerarProximoPrimo(int ultimoPrimoConhecido) {
       int proximoNumero = ultimoPrimoConhecido + 1;
       while (!verficiarNumeroPrimo(proximoNumero)) {
           proximoNumero++;
       }
       return proximoNumero;
   }
}
