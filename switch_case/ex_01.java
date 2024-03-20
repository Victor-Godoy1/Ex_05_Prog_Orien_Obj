package switch_case;

import javax.swing.*;
import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

//        1 ) -  Escreva um programa que solicite ao
//        usuário um número de 1 a 7 representando um
//        dia da semana. O programa deve usar um switch-case
//            para exibir o nome do dia correspondente.


         int opcao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite de 1 a 7 e veja qual o nome do dia :");
        opcao = sc.nextInt();

        switch (opcao){

            case 1 :
                System.out.println(" Você selecionou - Segunda");
                break;
            case 2 :
                System.out.println(" Você selecionou - Terça");
                break;
            case 3 :
                System.out.println(" Você selecionou - Quarta");
                break;
            case 4 :
                System.out.println(" Você selecionou - Quinta");
                break;
            case 5 :
                System.out.println(" Você selecionou - Sexta");
                break;
            case 6 :
                System.out.println(" Você selecionou - Sábado");
                break;
            case 7 :
                System.out.println(" Você selecionou - Domingo");
                break;
            default :
                System.out.println(" Opção inválida ");
                break;
        }






    }
}
