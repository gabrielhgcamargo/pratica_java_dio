package gabrielhgcamargo.github.io.Tratamento_de_Excecoes;


public class DivisaoExataException extends Exception {

    private int numerador;
    private int denominador;

    public DivisaoExataException(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
