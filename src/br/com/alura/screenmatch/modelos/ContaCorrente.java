package br.com.alura.screenmatch.modelos;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        double saldoAtual = this.getSaldo();
        saldoAtual -= tarifaMensal;
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldoAtual);
    }
}
