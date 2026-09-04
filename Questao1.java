// Calcule o fatorial de um número.
// O algoritmo deve ler um número natural informado pelo usuário.
// Se o usuário inserir um número negativo, o algoritmo deve informar que o número é inválido.

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.print("Digite um número natural: ");
        numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido.");
        } else {

            for (int i = 1; i <= numero; i++) {
                fatorial = fatorial * i;
            }

            System.out.println("Fatorial de " + numero + ": " + fatorial);
        }

        input.close();

    }
}