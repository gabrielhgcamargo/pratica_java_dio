package gabrielhgcamargo.github.io.Logica_Condicional_e_Controle_de_Fluxos;

import java.util.Objects;

public class MainControleFluxo {
    public static void main(String[] args) {

        System.out.println("---Exercício If-Mês---");
        //Print que chama o método para exibir o mês conforme o número passado na assinatura
        System.out.println("Estamos no mês de " + retornaMes(2));


        System.out.println(" ");
        System.out.println("---Exercício If-Férias---");
        //Print na tela, que chama o método que retorna se é mês de Férias ou não, conforme o número do Mês informado na assinatua.
        System.out.println(retornaFerias(7));


        System.out.println(" ");
        System.out.println("---Exercício Switch-Dia da Semana---");
        //Print que chama o método para exibir o número do dia da semana, conforme o dia passado como String.
        System.out.println(retornaDia("Domingo"));


        System.out.println(" ");
        System.out.println("---Exercício Switch-Variavel---");
        //Print que retorna a mensagem conforme o número passado via parâmetro
        System.out.println(retornaTexto(6));


    }

    //Método que recebe o mês via parâmetro, e retorna o mesmo em escrito.
    public static String retornaMes(Integer mes){
        if (mes == 1){
            return "Janeiro";
        }
        else if(mes == 2){
            return "Fevereiro";
        }
        else if (mes == 3){
            return "Março";
        }
        else if(mes == 4){
            return "Abril";
        }
        else if(mes == 5){
            return "Maio";
        }
        else if(mes == 6){
            return "Junho";
        }
        else if(mes == 7){
            return "Julho";
        }
        else if(mes == 8){
            return "Agosto";
        }
        else if(mes == 9){
            return "Setembro";
        }
        else if(mes == 10){
            return "Outubro";
        }
        else if(mes == 11){
            return "Novembro";
        }
        else if (mes == 12){
            return "Dezembro";
        }
        else{
            return "!!! - Número do mês é inválido - !!!";
        }

    }

    //Método que recebe o número do mês via Parametro e retorna se é equivalente a Mês de Ferias ou não
    public static String retornaFerias(Integer mes){
        if(mes == 7 || mes == 12 || mes == 1){
            return "Férias!";
        }
        else {
            return "Sem Férias por enquanto...";
        }
    }

    //Método que retorna o numero do dia com base em sua versão escrita (String)
    public static Integer retornaDia(String dia){
        switch (dia){
            case "Domingo":
                return 1;

            case "Segunda":
                return 2;

            case "Terca":
                return 3;

            case "Quarta":
                return 4;

            case "Quinta":
                return 5;

            case "Sexta":
                return 6;

            case "Sabado":
                return 7;

            default:
                return null;
        }
    }

    // Método que retorna um texto com base no número passado via parâmetro
    public static String retornaTexto(Integer numero){
        switch (numero){
            case 1:
            case 2:
            case 3:
                return "Certo!";

            case 4:
                return "Errado!";

            case 5:
                return "Talvez!";

            default:
                return "Valor Indefinido!";
        }
    }
}
