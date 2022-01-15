package gabrielhgcamargo.github.io.Entendendo_metodos_java;

//Classe com o método responsável por receber e calcular o Valor total do empréstimo conforme as parcelas
public class Emprestimo {

    public double geraValor(Integer valorEmprestimo, Integer parcelas){
        return valorEmprestimo + ((valorEmprestimo * 0.028) * parcelas);
    }

}
