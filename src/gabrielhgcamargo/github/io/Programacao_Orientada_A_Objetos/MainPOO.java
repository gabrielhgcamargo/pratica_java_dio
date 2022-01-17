package gabrielhgcamargo.github.io.Programacao_Orientada_A_Objetos;

public class MainPOO {

    public static void main(String[] args) {

        // Criando os objetos
        Carro Honda = new Carro();
        Carro Toyota = new Carro();
        Carro Hyundai = new Carro();

        // Inserindo valores da instância e Exibindo-os
        Honda.setCor("Branco");
        Honda.setModelo("Civic");
        Honda.setCapacidadeTanque(100);
        System.out.println("HONDA");
        System.out.println("Cor: " + Honda.getCor());
        System.out.println("Modelo: " + Honda.getModelo());
        System.out.println("Capacidade do Tanque: " + Honda.getCapacidadeTanque() + "L");
        System.out.println("Preço total para encher o tanque: " + Honda.calculaPrecoTanque(5.89d));

        System.out.println(" --- ");

        Toyota.setCor("Cinza");
        Toyota.setModelo("Corolla");
        Toyota.setCapacidadeTanque(90);
        System.out.println("TOYOTA");
        System.out.println("Cor: " + Toyota.getCor());
        System.out.println("Modelo: " + Toyota.getModelo());
        System.out.println("Capacidade do Tanque: " + Toyota.getCapacidadeTanque() + "L");
        System.out.println("Preço total para encher o tanque: " + Toyota.calculaPrecoTanque(5.89d));

        System.out.println(" --- ");

        Hyundai.setCor("Preto");
        Hyundai.setModelo("HB20");
        Hyundai.setCapacidadeTanque(80);
        System.out.println("HYUNDAI");
        System.out.println("Cor: " + Hyundai.getCor());
        System.out.println("Modelo: " + Hyundai.getModelo());
        System.out.println("Capacidade do Tanque: " + Hyundai.getCapacidadeTanque() + "L");
        System.out.println("Preço total para encher o tanque: " + Hyundai.calculaPrecoTanque(5.89d));
    }
}

