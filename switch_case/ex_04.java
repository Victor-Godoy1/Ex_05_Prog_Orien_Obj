package switch_case;

import java.util.Scanner;

public class ex_04 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Selecione a operação: (+, -, *, /)");
        String operador = scanner.next();

        operacao(num1, num2, operador);
    }

    public static void operacao(int num1, int num2, String operador) {
        switch (operador) {
            case "+":
                System.out.println("Soma: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Subtração: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplicação: " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("Divisão: " + ((double) num1 / num2));
                } else {
                    System.out.println("Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }
    }
}




