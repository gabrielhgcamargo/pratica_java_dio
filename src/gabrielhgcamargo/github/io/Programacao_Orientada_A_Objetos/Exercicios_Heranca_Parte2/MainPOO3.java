package gabrielhgcamargo.github.io.Programacao_Orientada_A_Objetos.Exercicios_Heranca_Parte2;

// Classe criada para o aprendizado de Polimorfismo/Sobrescrita

public class MainPOO3 {
    public static void main(String[] args) {

        ClasseSuper[] lista = new ClasseSuper[]{new ClasseSuper(), new ClasseFilha1(), new ClasseFilha2() };

        for (ClasseSuper classe:lista
             ) {
            classe.apresentar();
        }
    }
}
