package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.arrays;

// Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
// e armazene-os num vetor.
// Ao final mostre os números e seus sucessores

import java.util.Random;

public class ExercicioNumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] number = new int[20];

        for(int i = 0; i< number.length; i++){
            number[i] = random.nextInt(100);
        }

        for (int i = 0; i < number.length; i++){
            System.out.println("VETOR[" + i + "] = " + number[i] + " // Sucessor = " + (number[i] + 1));
        }
    }
}
