import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 3. Implemente um programa que calcule e exiba os primeiros n números
         * da sequência de Fibonacci. n deve ser fornecido pelo/a usuário/a.
         *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Insira um número maior que zero.");
        } else {
            if (n == 1) {
                System.out.println("0");
            } else {
                int[] fibonacciSequencia = new int[n];
                fibonacciSequencia[0] = 0;
                fibonacciSequencia[1] = 1;

                for (int i = 2; i < n; i++) {
                    fibonacciSequencia[i] = fibonacciSequencia[i - 1] + fibonacciSequencia[i - 2];
                }

                System.out.println(Arrays.toString(Arrays.copyOf(fibonacciSequencia, n)));
            }
        }

    }

}