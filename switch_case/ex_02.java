package switch_case;

import java.util.Scanner;

public class ex_02 {

    public static void main(String[] args) {

//       2 ) - Escreva um programa que solicite ao usuário um
//        número de 1 a 12 representando um mês do ano.
//        O programa deve usar um switch-case para
//         exibir o signo correspondente a esse mês.


        int opcao;

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um mes de 1 a 12 e veja seu signo : ");
        opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Janeiro - Capricórnio");
                break;
            case 2:
                System.out.println("Fevereiro - Aquário");
                break;
            case 3:
                System.out.println("Março - Peixes");
                break;
            case 4:
                System.out.println("Abril - Áries");
                break;
            case 5:
                System.out.println("Maio - Touro");
                break;
            case 6:
                System.out.println("Junho - Gêmeos");
                break;
            case 7:
                System.out.println("Julho - Câncer");
                break;
            case 8:
                System.out.println("Agosto - Leão");
                break;
            case 9:
                System.out.println("Setembro - Virgem");
                break;
            case 10:
                System.out.println("Outubro - Libra");
                break;
            case 11:
                System.out.println("Novembro - Escorpião");
                break;
            case 12:
                System.out.println("Dezembro - Sagitário");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }








    }

}
