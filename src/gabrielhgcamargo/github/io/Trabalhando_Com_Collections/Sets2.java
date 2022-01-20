package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Sets2 {

    public static void main(String[] args) {
        // SOBRESCREVER NA CLASSE : Equals and HashCode quando utlizamos Hash



        // ORDEM ALEATÓRIA
        Set<Heroes> meusHerois = new HashSet<>(){{
            add(new Heroes("Spider-Man","Sentido Aranha", 22));
            add(new Heroes("Iron Man","Bilionário e Filantropo", 40));
            add(new Heroes("Captain America","Soro do Super Soldado",83));
        }};

        System.out.println("Ordem Aleatória: " + meusHerois);


        // ORDEM  INSERÇÃO
        Set<Heroes> meusHerois2 = new LinkedHashSet<>(){{
            add(new Heroes("BlackWidow","Agilidade", 36));
            add(new Heroes("Sam","Soldado", 31));
            add(new Heroes("Thor","God of Thunder", 5000));
        }};

        System.out.println("Ordem Inserção: " + meusHerois2);


        // ORDENAÇÃO CUSTOMIZADA
        // TreeSet necessita que a Classe tenha implementado o Comparable

        Set<Heroes> meusHerois3 = new TreeSet<>(){{
            add(new Heroes("Capitã Marvel","Teseract",38));
            add(new Heroes("Stephen Strange","Mago Supremo",44));
            add(new Heroes("Hulk","Exposição Gama",46));
        }};

            // POR IDADE (INTEGER)
            /*

             @Override
            public int compareTo(Heroes hero) {
            return Integer.compare(this.getIdade(),hero.getIdade());
            }

             */

            System.out.println("Ordem Idade = " + meusHerois3 );



    }

}

class Heroes implements Comparable<Heroes>{

    private String nome;
    private String poder;
    private Integer idade;

    public Heroes(String nome, String poder, Integer idade) {
        this.nome = nome;
        this.poder = poder;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getPoder() {
        return poder;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "\n" + nome + " - " + poder + " - " + idade + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return nome.equals(heroes.nome) && poder.equals(heroes.poder) && idade.equals(heroes.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, poder, idade);
    }

    @Override
    public int compareTo(Heroes hero) {
        return Integer.compare(this.getIdade(),hero.getIdade());
    }
}
