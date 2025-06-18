import br.com.alura.screenmatch.modelos.ContaBancaria;
import br.com.alura.screenmatch.modelos.ContaCorrente;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.depositar(1000);
        contaBancaria.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(2000);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(1500);
        contaCorrente.consultarSaldo();
    }
}
