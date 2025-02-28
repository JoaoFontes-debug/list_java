import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Divide a frase em palavras usando o espaço em branco como separador
        String[] palavras = frase.split("\\s+");

        // Conta o número de palavras
        int numeroDePalavras = palavras.length;

        System.out.println("Número de palavras na frase: " + numeroDePalavras);
    }
}