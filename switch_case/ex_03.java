package switch_case;

import java.util.Scanner;

public class ex_03 {


    public static void main(String[] args) {

//         3 ) - Crie um programa de calculadora
//        simples que peça ao usuário para inserir
//        dois números e um operador matemático
//        (+ , - , * , / ). Utilize um switch-case
//            para realizar a operação escolhida e
//        exibir o resultado.


        int n1,n2, calculo;
        String opcao;


        Scanner sc = new Scanner(System.in);



        System.out.println("Digite 1 número inteiro : ");
        n1 = sc.nextInt();

        System.out.println("Digite 2 número inteiro : ");
        n2 = sc.nextInt();


        System.out.println("Selecione o que quer : ");
        System.out.println(" (  +  soma , - subtração   ,  * multiplicação  , / divisão  )");
        opcao = sc.next();

        switch (opcao){


            case "+":
                calculo = n1 + n2;
                System.out.println("Soma : " + n1 + " + " + n2 + " = " + calculo );
                break;
            case "-":
                calculo = n1 - n2;
                System.out.println("Subtração : " + n1 + " - " + n2 + " = " + calculo );
                break;
            case "*":
                calculo = n1 * n2;
                System.out.println("Multiplicação : " + n1 + " * " + n2 + " = " + calculo );
                break;
            case "/":
                calculo = n1 / n2;
                System.out.println("Divisão : " + n1 + " / " + n2 + " = " + calculo );
                break;
            default :
                System.out.println("Opção errada! ");
                break;
        }



    }

}
