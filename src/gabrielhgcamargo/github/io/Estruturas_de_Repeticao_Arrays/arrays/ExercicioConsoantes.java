package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.arrays;

import java.util.Scanner;

// Criar um programa que leia um vetor de 6 caracteres, e diga
// quantas consoantes foram lidas
// além de as imprimir.

public class ExercicioConsoantes {
    public static void main(String[] args) {

        String[] letras = new String[6];
        Scanner teclado = new Scanner(System.in);
        int qtdConsoantes = 0, count = 1;

        for (int i = 0; i < letras.length; i++){
            System.out.print("Digite o caractere da posição [" + i + "] = ");
            letras[i] = teclado.next();
        }

        for (String letra: letras
             ) {
            if (letra.equalsIgnoreCase("a")
                    | letra.equalsIgnoreCase("e")
                    | letra.equalsIgnoreCase("i")
                    | letra.equalsIgnoreCase("o")
                    | letra.equalsIgnoreCase("u"))
            {
                //Nothing to do
            }
            else {
                qtdConsoantes++;
                System.out.println("Consoante " + count + " = " + letra);
                count++;
            }
        }
        System.out.println("Quantidade de consoantes = " + qtdConsoantes);
        }
    }


