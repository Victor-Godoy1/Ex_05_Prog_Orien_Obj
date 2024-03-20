package if_else;

import java.util.Scanner;

public class ex_06 {

    public static void main(String[] args) {

//        6 ) - Escreva um programa que peça ao
//        usuário para inserir um ano e determine se esse ano é bissexto ou não.

//          se o ano for divisível por 4 (é bissexto) mas tambem por 100 ( não é )
//          e se for divisivel por400
//          (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)


        int ano;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano : ");
        ano = sc.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano " + ano + " é bissexto! ");
        }else{
            System.out.println("Não é bissexto!");
        }


    }
}
