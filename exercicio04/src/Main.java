import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * 4. Escreva um programa que receba duas palavras e determine se elas
     * são anagramas (se possuem as mesmas letras, mas em ordem diferente).
     * Exemplo: "amor" e "roma".
     */


    public static void main(String[] args) {
        System.out.println("Digite duas palavras e desculbra se sao anagramas");
        Scanner entrada = new Scanner(System.in);
        String palavra1 = entrada.nextLine().trim().toLowerCase();
        String palavra2 = entrada.nextLine().trim().toLowerCase();

        // Verifica se as palavras têm menos de 2 caracteres ou contêm números
        if (palavra1.length() < 2 || palavra2.length() < 2
                || palavra1.matches(".*\\d.*") || palavra2.matches(".*\\d.*")) {
            System.out.println("Entrada invalida");
            entrada.close();
            return;
        }

        // Verifica se são anagramas
        char[] letras1 = palavra1.toCharArray();
        char[] letras2 = palavra2.toCharArray();

        Arrays.sort(letras1);
        Arrays.sort(letras2);

        if (Arrays.equals(letras1, letras2)) {
            System.out.println("Sao anagramas");
        } else {
            System.out.println("Nao sao anagramas");
        }

        entrada.close();
    }
}