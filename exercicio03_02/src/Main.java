import java.util.Scanner;

public class Main {

    /**
     * Crie um programa que leia um número inteiro e exiba o número invertido.
     * Exemplo: se o usuário digitar 1234, o programa deve exibir 4321.
     *
     */

    public static void main(String[] args) {

        System.out.println("Digite um numero qualquer.");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int original = numero;
        int invertido = 0;

        numero = Math.abs(numero);

        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        if (original < 0) {
            invertido *= -1;
        }

        System.out.println(invertido);
        scanner.close();
    }

}