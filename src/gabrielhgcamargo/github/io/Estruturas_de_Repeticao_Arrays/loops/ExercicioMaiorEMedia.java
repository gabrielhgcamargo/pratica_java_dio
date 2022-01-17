package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

// Faça um programa que leia 5 números e informe o maior número e média desses números.
//UTILIZANDO DO WHILE

import java.util.Scanner;

public class ExercicioMaiorEMedia {

    public static void main(String[] args) {
        int num, cont = 0, aux = 0;
        double soma = 0;
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.print("Insira o número[" + (cont + 1) + "] = ");
            num = teclado.nextInt();

            if(num > aux)
                aux = num;

            soma+=(double)num;
            cont++;
        }while (cont< 5);

        System.out.println("O maior número inserido foi " + aux + " e a média dos valores foi " + (soma/5));
    }

}
