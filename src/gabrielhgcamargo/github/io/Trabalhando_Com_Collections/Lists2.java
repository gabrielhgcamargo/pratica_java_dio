package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lists2 {
    public static void main(String[] args) {
        List<Campeao> meusMains = new ArrayList<>(){{
            add(new Campeao("Katarina","Mid", 27));
            add(new Campeao("Irelia","Top/Mid", 31));
            add(new Campeao("Jinx","Bot-Adc", 22));
        }};

    // Exibir na ordem de inserção
        System.out.println(meusMains);

    // Embaralhar os elementos da lista
        Collections.shuffle(meusMains);

    // Ordenação pelos atribytps -> ir na Classe do Objeto da lista, implementar Comparable<nome_da_classe>
    // Ao implementar, vai pedir para fazer um @Override de compareTo();
    // E para cada atributo que voce deseja escolher como ordenação, terá um retorno diferente.

        // Ordem Natural (Nome) (Esse padrão serve para Strings)

            /*

            @Override
            public int compareTo(Campeao campeao) {
            return this.getNome().compareToIgnoreCase(campeao.getNome());
            }

            */

             Collections.sort(meusMains);
             System.out.println("Ordem Natural (Nome) \n  " + meusMains);

        // Ordem numérica (idade)
        // (Como já usamos o Comparable para String,
        // para não ter de ficar mudando o retorno do método CompareTo(),
        // faremos o uso do Comparator)
        // Para isso criamos a classe ComparatorIdade (exemplo) e implements Comparator<Campeao>
        // Agora realizamos o @Override do método compare();

             /*

            @Override
            public int compare(Campeao campeao1, Campeao campeao2) {
            return Integer.compare(campeao1.getIdade(), campeao2.getIdade());
            }

            */

        Collections.sort(meusMains, new ComparatorIdade());
        // ou
        meusMains.sort( new ComparatorIdade());
        System.out.println("Ordem Numérica - Idade \n " + meusMains);


        // Ordenação String - Utilizando o Comparator
        /*

        @Override
        public int compare(Campeao c1, Campeao c2) {
        return c1.getLane().compareToIgnoreCase(c2.getLane());
        }

         */

        Collections.sort(meusMains, new ComparatorLane());
        // ou
        meusMains.sort( new ComparatorLane());
        System.out.println("Ordenação por outro atributo (String) - Lane \n " + meusMains);


    }
}

class Campeao implements Comparable<Campeao>{
    private String nome;
    private String lane;
    private Integer idade;

    public Campeao(String nome, String lane, Integer idade) {
        this.nome = nome;
        this.lane = lane;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getLane() {
        return lane;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "{ Campeão = " + this.nome + " // Lane = " + this.lane + " // Idade = " + this.idade + "}";
    }

    @Override
    public int compareTo(Campeao campeao) {
        return this.getNome().compareToIgnoreCase(campeao.getNome());
    }
}

class ComparatorIdade implements Comparator<Campeao>{

    @Override
    public int compare(Campeao c1, Campeao c2) {
        return Integer.compare(c1.getIdade(), c2.getIdade());
    }

}

class ComparatorLane implements Comparator<Campeao>{
    @Override
    public int compare(Campeao c1, Campeao c2) {
        return c1.getLane().compareToIgnoreCase(c2.getLane());
    }
}