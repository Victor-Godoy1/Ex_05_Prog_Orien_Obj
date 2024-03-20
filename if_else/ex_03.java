package if_else;

import java.util.Locale;
import java.util.Scanner;

public class ex_03 {


    public static void main(String[] args) {

    // 3 ) - Desenvolva um programa que receba três números do usuário e determine qual é o maior.

        Float n1, n2, n3;

        // separador vai ser o ponto e nao a virgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1 número : ");
        n1 = sc.nextFloat();

        System.out.println("Digite o 2 número : ");
        n2 = sc.nextFloat();

        System.out.println("Digite o 3 número : ");
        n3 = sc.nextFloat();

        if( n1 > n2 && n1 > n3 ){
            System.out.println("O primeiro número : " + n1 + " é o maior " );
        } else if ( n2 > n1 && n2 > n3 ){
            System.out.println("O segundo número : " + n2 + " é o maior " );
        } else {
            System.out.println("O terceiro número : " + n3 + " é o maior " );
        }


    }

}
