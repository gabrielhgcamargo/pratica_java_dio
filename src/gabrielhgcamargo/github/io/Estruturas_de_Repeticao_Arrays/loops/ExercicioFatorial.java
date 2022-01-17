package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

// Faça um programa que calcule o fatorial de um número inteiro
// fornecido pelo usuário. Ex: 5!=120
// UTILIZANDO FOR

import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String[] args) {
        int num,fatorial = 1;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Calcular o fatorial de = ");
        num = teclado.nextInt();

        for (int i = num; i > 0; i--){
            fatorial*= i;
        }
        System.out.println(num+ "! = " + fatorial);
    }
}
