import br.com.alura.screenmatch.modelos.GeradorPrimo;
import br.com.alura.screenmatch.modelos.NumerosPrimos;
import br.com.alura.screenmatch.modelos.VerificadorPrimo;

public class TesteNumerosPrimos {
    public static void main(String[] args) {
        VerificadorPrimo verificadorPrimo = new VerificadorPrimo();
        verificadorPrimo.verificarSeEhPrimo(17);

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        int proximoPrimo = geradorPrimo.gerarProximoPrimo(17);
        System.out.println("O proximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(20);
    }
}
