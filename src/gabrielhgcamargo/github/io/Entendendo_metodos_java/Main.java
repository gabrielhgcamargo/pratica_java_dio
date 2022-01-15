package gabrielhgcamargo.github.io.Entendendo_metodos_java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.soma(10,10));
        System.out.println(calculadora.subtracao(15,5));
        System.out.println(calculadora.multiplicacao(12,12));
        System.out.println(calculadora.divide(15.0f,2.0f));
    }
}
