package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

//Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno,
//e o segundo representando sua idade. -> PARE inserindo o valor 0 no campo nome.
//UTILIZANDO WHILE

import java.util.Scanner;

public class ExercicioNomeIdade {

    public static void main(String[] args) {

        int age, cont = 1;
        String nome = "null";
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Nome aluno " + cont + " : ");
            nome = teclado.next();

            if (nome.equals("0"))
                break;

            System.out.print("Idade do aluno " + cont + " : ");
            age = teclado.nextInt();

            cont++;
        }
        System.out.println("Programa finalizado devido a inserção de '0' no campo nome!");
    }
}
