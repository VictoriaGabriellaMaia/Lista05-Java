// Leia uma quantidade indeterminada de idades e calcule e mostre a média das idades informadas.
// O programa termina quando o usuário informar uma idade negativa.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int idade;
        int soma = 0;
        int totalIdades = 0;

        System.out.print("Digite uma idade (negativa para encerrar): ");
        idade = input.nextInt();

        for (int i = 0; idade >= 0; i++) {

            soma = soma + idade;
            totalIdades++;

            System.out.print("Digite uma idade (negativa para encerrar): ");
            idade = input.nextInt();
        }

        if (totalIdades > 0) {
            double media = (double) soma / totalIdades;

            System.out.println("Média das idades: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        input.close();

    }
}
