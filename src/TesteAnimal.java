import br.com.alura.screenmatch.modelos.Cachorro;
import br.com.alura.screenmatch.modelos.Gato;

public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
