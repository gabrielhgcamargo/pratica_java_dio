package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

// Desenvolver um gerador de tabuada, capaz de gerar a tabuada de qualquer número
// entre 1 a 10.
// O usuário deve informar qual número ele deseja ver a tabuada.
// UTILIZANDO FOR

import java.util.Scanner;

public class ExercicioTabuada {
    public static void main(String[] args) {
        int num;
        Scanner teclado =  new Scanner(System.in);

        while (true) {
            System.out.print("Mostrar tabuada do número = ");
            num = teclado.nextInt();
            if (num>=1 && num<=10) break;
            else System.out.println("Número Inválido, valor deve ser entre 1 e 10");
        }

        for(int i = 1; i < 11; i++){
            System.out.println(num + " X " + i + " = " + (num*i));
        }
    }
}
