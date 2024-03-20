package if_else;

import java.util.Locale;
import java.util.Scanner;

public class ex_02 {


    public static void main(String[] args) {
//         2 ) - Crie um programa que peça ao usuário para inserir sua nota
//        final em uma disciplina. Em seguida o programa deve decidir e
//        exibir se o aluno foi aprovado, reprovado ou se ficou de exame:
//
//        Aprovado: Nota superiores ou iguais a 6
//        Reprovado: Notas inferiores a 2
//        Exame: Notas entre 2 e 5,996


        Float nota;

        // Quero que o separador seja um ( ponto ) e não uma virgula
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua nota final : ");
        nota = sc.nextFloat();

        if( nota >= 6 ){
            System.out.println("Aprovado");
        }  else if(nota >= 2 && nota < 6) {
            System.out.println("Exame");
        }
        else{
            System.out.println("Reprovado");
        }



    }


}

