package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.loops;

// Faça um progrma que peça a nota, entre 0 e 10.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo.
// Até que o usuário informe um valor válido.
// UTILIZANDO WHILE

import java.util.Scanner;

public class ExercicioNota {
    public static void main(String[] args) {

        double nota;
        Scanner teclado = new Scanner(System.in);

        while(true){
            System.out.print("Informe a nota (entre zero e dez) : ");
            nota = teclado.nextDouble();

            if(nota>=0d && nota<=10d)
                break;
            else{
                System.out.println("Nota Inválida!");
            }
        }
    }
}
