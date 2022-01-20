package gabrielhgcamargo.github.io.Tratamento_de_Excecoes;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[] numerador = {100,200,300,400,500};
        int[] denominador = {10,10,10,10,10};

        for(int i = 0; i<denominador.length; i ++){
            try {
                if ((denominador[i] % 2) != 0)
                    throw new DivisaoExataException("Divisão não exata!", numerador[i], denominador[i]);

                int answer = numerador[i] / denominador[i];
                System.out.println(numerador[i] + " / " + denominador[i] + " = " + answer);
            }catch (DivisaoExataException | ArrayIndexOutOfBoundsException | ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("finalizado");
    }
}
