package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.arrays;

// Criar e Imprimir uma matriz 4x4 com valores aleatórios entre 0 e 9.

import java.util.Random;

public class ExercicioMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(9);
                System.out.print(" Matriz[" + i + "][" + j + "] = " + matriz[i][j] + " | ");
            }
            System.out.println(" ");
        }
    }
}
