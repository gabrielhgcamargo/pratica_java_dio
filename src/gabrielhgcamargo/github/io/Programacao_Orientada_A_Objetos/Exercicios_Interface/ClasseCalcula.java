package gabrielhgcamargo.github.io.Programacao_Orientada_A_Objetos.Exercicios_Interface;

// Classe criada para o entendimento do uso de Interfaces


public class ClasseCalcula implements OperacaoMatematica{
    @Override
    public void soma(double num1, double num2) {
        System.out.println("Soma = " + (num1 + num2));
    }

    @Override
    public void divide(double num1, double num2) {
        System.out.println("Divisão = " + (num1/num2));
    }

    @Override
    public void subtrai(double num1, double num2) {
        System.out.println("Subtração = " + (num1-num2));
    }

    @Override
    public void multiplica(double num1, double num2) {
        System.out.println("Multiplicação = " + (num1*num2));
    }
}
