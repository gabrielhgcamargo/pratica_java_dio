package gabrielhgcamargo.github.io.Entendendo_metodos_java;

// Classe com os métodos de sobrecarga, que calcula a area do poligono conforme os parametros recebidos
public class CalculaAreaPoligonos {

    public static Integer calcularArea(Integer lado){
        System.out.println("Como foi passado apenas um argumento, área do quadrado = " );
        return lado * lado;
    }

    public static Float calcularArea(Float lado1, Float lado2){
        System.out.println("Como foram passados dois argumentos, área do retângulo = ");
        return lado1 * lado2;
    }

    public static Float calcularArea(Float baseMenor, Float baseMaior, Float altura){
        System.out.println("Como foram passados tres arguemntos, área do trapézio = ");
        return ((baseMenor + baseMaior) *  altura) / 2;

    }

}
