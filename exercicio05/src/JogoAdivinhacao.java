import java.util.Random;

public class JogoAdivinhacao {

    private int numeroSecreto;

    public JogoAdivinhacao() {
        Random random = new Random();
        numeroSecreto = random.nextInt(50) + 1; // Gera número entre 1 e 50
    }

    public boolean verificarPalpite(int palpite) {
        return palpite == numeroSecreto;
    }
}
