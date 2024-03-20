package if_else;

import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
//        1 ) - Escreva um programa em Java que
//        solicite ao usuário um número inteiro
//        e em seguida determine e imprima se o
//        número é par ou ímpar.


        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro : ");
        n = sc.nextInt();

        if(n % 2 == 0) {
            System.out.println("É par");
        }else{
            System.out.printf("É ímpar");
        }





    }


}
