package gabrielhgcamargo.github.io.Entendendo_metodos_java;

//Classe com o método que gera a mensagem conforme o horario
public class Mensagem {

    public String enviaMensagem(Integer horas){
        if (horas >= 5 && horas <= 12){
            return "Bom dia!";
        }
        else if(horas > 12 && horas <= 18){
            return "Boa tarde !";
        }
        return "Boa noite!";
    }
}
