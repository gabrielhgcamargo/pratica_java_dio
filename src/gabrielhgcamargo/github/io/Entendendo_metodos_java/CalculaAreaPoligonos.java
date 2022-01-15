package gabrielhgcamargo.github.io.Entendendo_metodos_java;

public class CalculaAreaPoligonos {

    public static void calcularArea(Integer lado){
        System.out.println("Como foi passado apenas um argumento, área do quadrado = " + lado*lado);
    }

    public static void calcularArea(Integer lado1, Integer lado2){
        System.out.println("Como foram passados dois argumentos, área do retângulo = " + lado1 * lado2);
    }

    public static void calcularArea(Integer baseMenor, Integer baseMaior, Integer altura){
        System.out.println("Como foram passados tres arguemntos, área do trapézio = " + ((baseMenor + baseMaior) * altura) / 2);
    }

}
