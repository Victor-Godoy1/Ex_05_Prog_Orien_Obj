package if_else;

import java.util.Scanner;

public class ex_04 {


    public static void main(String[] args) {

//        4 ) - Crie um programa que peça para o
//        usuário inserir um número, e em seguida informe
//        se o número é positivo, negativo ou zero.


         int n;

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite um número : ");
         n = sc.nextInt();

         if( n > 0 ){
             System.out.println("O número é positivo");
         } else if( n < 0  ){
             System.out.println("O número é negativo");
         } else {
             System.out.println("O número é ZERO");
         }



    }
}
