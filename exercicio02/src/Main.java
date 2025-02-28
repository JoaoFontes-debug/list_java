import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 2. Crie um programa que leia uma palavra e verifique se ela
         * é um palíndromo (se pode ser lida da mesma forma de trás para frente).
         * Ignore diferenças entre maiúsculas e minúsculas.
         *
         * Exemplos para testar:
         *
         *   ovo
         *   arara
         *   radar
         *   osso
         *   rever
         *   anilina
         *   mirim
         *   socos
         *   salas
         *   rapar
         */

        System.out.println("Digite uma palavra para saber se esta é palíndroma");
        Scanner entrada = new Scanner(System.in);
        String palavra = entrada.nextLine();
        String palavraFormatada = palavra.toLowerCase();

        String palavraInvertida = "";
        for (int i = palavraFormatada.length() - 1; i >= 0; i--) {
            palavraInvertida += palavraFormatada.charAt(i);
        }

        if (palavraFormatada.equals(palavraInvertida)) {
            System.out.println("É palíndroma");
        } else {
            System.out.println("Não é palíndroma");
        }

        entrada.close();
    }
}