package gabrielhgcamargo.github.io.Programacao_Orientada_A_Objetos;

// Classe criada como exercício de Estrutura-Basica da OO
public class Carro {

    private String cor;
    private String modelo;
    private int capacidadeTanque;

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public Carro() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", capacidadeTanque=" + capacidadeTanque +
                '}';
    }

    public double calculaPrecoTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
