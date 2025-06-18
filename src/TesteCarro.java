import br.com.alura.screenmatch.modelos.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Hatch");
        carro.definirPrecos(30000, 32000, 35000);
        carro.exibirInfo();
    }
}
