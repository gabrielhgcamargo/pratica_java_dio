package gabrielhgcamargo.github.io.Entendendo_metodos_java;

public class Calculadora {
    private Integer valor1;
    private Integer valor2;

    public Calculadora(Integer valor1, Integer valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora() {
    }

    public  Integer soma(Integer valor1, Integer valor2){
        return valor1 + valor2;
    }

    public Integer subtracao(Integer valor1, Integer valor2){
        return valor1 - valor2;
    }

    public  Integer multiplicacao(Integer valor1, Integer valor2){
        return valor1 * valor2;
    }

    public  Float divide(Float valor1, Float valor2){
        return valor1 / valor2;
    }
}
