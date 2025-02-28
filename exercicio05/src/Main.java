import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos tentar a sorte?");

        Scanner entrada = new Scanner(System.in);
        JogoAdivinhacao jogo = new JogoAdivinhacao();

        while (true) {
            System.out.print("Digite seu palpite (1-50): ");
            int palpite = entrada.nextInt();

            if (jogo.verificarPalpite(palpite)) {
                System.out.println("Certo! Parabens!");
                break;
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        }

        entrada.close();
    }
}