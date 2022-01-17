package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

// Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números
// pares e a quantidade de números ímpares.
// UTILIZANDO DO WHILE

import java.util.Scanner;

public class ExercicioParImpar {

    public static void main(String[] args) {
        int num, cont, contImpar = 0, contPar = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir = ");
        cont = teclado.nextInt();

        do {
            System.out.print("Número = ");
            num = teclado.nextInt();

            if (num%2 == 0) contPar++;
            else contImpar++;

            cont--;
        }while (cont > 0);

        System.out.println("Quantidade de números pares = " + contPar);
        System.out.print("Quantidade de números ímpares = " + contImpar);
    }
}
