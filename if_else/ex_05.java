package if_else;

import java.util.Locale;
import java.util.Scanner;

    public class ex_05 {

        public static void main(String[] args) {

//        5 ) - Crie um programa que permita ao usuário escolher entre
//        converter uma temperatura de Celsius para Fahrenheit ou de
//        Fahrenheit para Celsius. O programa deve solicitar a temperatura
//        e realizar as conversão de acordo com a escolha do usuário.
//
//        Celsius = (Fahrenheit - 32) / 1.8
//        Fahrenheit = 1,8*Celsius + 32

            double temperatura, C, F;
            String decisao;


            // virgula para ponto
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);


            System.out.println("Deseja digitar a temperatura em ( C - Celsius ou  F - Fahrenheit ) : ");
            decisao = sc.next();


            System.out.println("Digite a temperatura : ");
            temperatura = sc.nextFloat();

            if( decisao.equals("C")){
                F = 1.8* temperatura + 32;
                System.out.println("A temperatura " + temperatura + " Celsius para Fahrenheit é : " + F );

            } else if (decisao.equals("F")){
                C = (temperatura - 32) / 1.8;
                System.out.println("A temperatura " + temperatura + " Fahrenheit para Celsius é : " + C );

            } else {
                System.out.println("Opção inválida! Selecione ( C ou F )");
            }


        }

    }



