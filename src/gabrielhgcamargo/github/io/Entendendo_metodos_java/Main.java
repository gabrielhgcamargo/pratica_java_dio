package gabrielhgcamargo.github.io.Entendendo_metodos_java;

public class Main {

    public static void main(String[] args) {

        //Exercício da Caluladora
        System.out.println("---CALCULADORA---");

        Calculadora calculadora = new Calculadora();
        System.out.println("soma = " + calculadora.soma(10,10));
        System.out.println("subtracao = " + calculadora.subtracao(15,5));
        System.out.println("multiplicacao = " + calculadora.multiplicacao(12,12));
        System.out.println("divisao = " + calculadora.divide(15.0f,2.0f));


        //Exercicio de enviar Mensagem conforme o horario
        System.out.println(" ");
        System.out.println("---Mensagem---");
        Mensagem msg = new Mensagem();
        System.out.println(msg.enviaMensagem(21));

        //Exercício de Calcular proposta de empréstimo com base no valor requisitado e nas parcelas
        System.out.println(" ");
        System.out.println("---Emprestimo---");
        Emprestimo emprestimo = new Emprestimo();
        System.out.println("Valor total a ser pago posteriormente = " + emprestimo.geraValor(2000, 12));


    }



}
