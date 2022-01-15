package gabrielhgcamargo.github.io.Entendendo_metodos_java;

public class Main {

    public static void main(String[] args) {

        //Exercício da Caluladora
        System.out.println("---CALCULADORA---");
        System.out.println("soma = " + Calculadora.soma(10,10));
        System.out.println("subtracao = " + Calculadora.subtracao(15,5));
        System.out.println("multiplicacao = " + Calculadora.multiplicacao(12,12));
        System.out.println("divisao = " + Calculadora.divide(15.0f,2.0f));


        //Exercicio de enviar Mensagem conforme o horario
        System.out.println(" ");
        System.out.println("---Mensagem---");
        System.out.println(Mensagem.enviaMensagem(21));

        //Exercício de Calcular proposta de empréstimo com base no valor requisitado e nas parcelas
        System.out.println(" ");
        System.out.println("---Emprestimo---");
        System.out.println("Valor total a ser pago posteriormente = " + Emprestimo.geraValor(15000, 2));

    }
}
