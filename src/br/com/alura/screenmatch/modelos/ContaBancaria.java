package br.com.alura.screenmatch.modelos;

public class ContaBancaria {
    private double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito no valor de: " + valor + " realizado. Saldo atual é: " + this.saldo);
    }

    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("Você sacou um valor : " + valor + " saldo atual: " + this.saldo);
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual é: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
