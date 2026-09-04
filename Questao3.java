// Leia dois números inteiros e imprima a potência do primeiro elevado ao segundo, utilizando somente operações de multiplicação.
// Não empregar a classe Math.

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int numero;
        int expoente;
        int resultado = 1;

        System.out.print("Digite o primeiro número: ");
        numero = input.nextInt();

        System.out.print("Digite o segundo número: ");
        expoente = input.nextInt();

        for (int i = 1; i <= expoente; i++) {
            resultado = resultado * numero;
        }

        System.out.println(numero + " elevado a " + expoente + " = " + resultado);

        input.close();

    }
}
