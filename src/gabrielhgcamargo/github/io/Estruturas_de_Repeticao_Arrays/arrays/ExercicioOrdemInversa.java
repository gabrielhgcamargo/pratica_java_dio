package gabrielhgcamargo.github.io.Estruturas_de_Repeticao_Arrays.arrays;

// Criar um vetor de 6 números inteiros e mostrar na ordem inversa.

public class ExercicioOrdemInversa {
    public static void main(String[] args) {
    int[] array = {100, 95, 87, -150, 552, 975};

        for (int i = array.length - 1; i >=0; i --){
            System.out.println("Array[" + i  + "] = " + array[i]);
        }
    }
}
