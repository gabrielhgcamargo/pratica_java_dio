package gabrielhgcamargo.github.io.Programacao_Orientada_A_Objetos.Exercicios_Heranca_Parte1;

// Classe criada para o entendimento do uso de Herança

public class MainPOO2 {
    public static void main(String[] args) {

        // UPCAST
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DOWNCAST
        // Vendedor vendedor1 = (Vendedor) new Funcionario();


    }
}
