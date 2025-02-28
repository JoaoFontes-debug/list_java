package exercicio01;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        /*1. Escreva um programa que peça dois números e um operador (+, -, *, /).
        Realize a operação indicada e exiba o resultado.

         */
        String ligaDesliga = "y";

        Scanner scanner = new Scanner(System.in);

       while (ligaDesliga.equalsIgnoreCase("y")){

           System.out.println("Digite um numero");
           String entrada01 = scanner.nextLine();

           System.out.println("Digite um numero");
           String entrada02 = scanner.nextLine();

           System.out.println("result" + validarNumero(entrada01));

           if (validarNumero(entrada01) && validarNumero(entrada02)){

               double numero01 = Double.parseDouble(entrada01);
               double numero02 = Double.parseDouble(entrada02);

               System.out.println("escolha a operação a ser realizada.");
               String operador = scanner.nextLine();

               switch (operador){
                   case "+":
                       double soma = numero01 + numero02;
                       System.out.println(numero01 + "+" + numero02 + " = " + soma);
                       break;
                   case "-":
                       double subtracao = numero01 - numero02;
                       System.out.println(numero01 + "-" + numero02 + " = " + subtracao );
                       break;
                   case "*":
                       double multplicacao = numero01 * numero02;
                       System.out.println(numero01 + "*" + numero02 + " = " + multplicacao );
                       break;
                   case "/":
                       if (numero02 != 0){
                           double divisao = numero01/numero02;
                           System.out.println(numero01 + " / " + numero02 + " = " + divisao);
                       }else{
                           System.out.println("Divisão por zero!");
                       }
                       break;
                   default:
                       System.out.println("Digite uma operação valida!");
               }

           }else {
               System.out.println("Numeros invalidos!");
           }


           System.out.println("Deseja Continuar? sim(y) ou não(n)");
           ligaDesliga = scanner.nextLine();



       }

        scanner.close();
    }

    public static boolean validarNumero(String valor){
        String regex = "^-?\\d+(\\.\\d+)?$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(valor);

        return matcher.matches();
    }


}
