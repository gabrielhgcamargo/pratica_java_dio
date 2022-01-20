package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import java.util.*;

public class Maps2 {

    public static void main(String[] args) {

        // Ordem Aleatoria - HashMap
        Map<String, Book> books = new HashMap<>(){{
            put("J K Rowling",new Book("Harry Potter 5", 500));
            put("Gabriel Camargo", new Book("Dia a Dia do Dev", 100));
            put("Stan Lee",new Book("Spider Man",1000));
        }};

        System.out.println(books);


        // Ordem Inserção - LinkedHashMap
        Map<String, Book> books2 = new LinkedHashMap<>(){{
            put("J K Rowling", new Book("HP 5", 510));
            put("Gabriel Camargo", new Book("Dia a Dia do Dev",100));
            put("Stan Lee", new Book("Spider Man", 1000));
        }};
        System.out.println(books2);

        // Ordem por Nome

        /*

         @Override
         public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
        }

         */
        Set<Map.Entry<String, Book>> books3 = new TreeSet<>(new ComparatorNome());
        books3.addAll(books2.entrySet());
        System.out.println(books3);


    }

}

class Book {
    private String nome;
    private Integer paginas;

    public Book(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nome.equals(book.nome) && paginas.equals(book.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Book>> {
    @Override
    public int compare(Map.Entry<String, Book> o1, Map.Entry<String, Book> o2) {
        return o1.getValue().getNome().compareToIgnoreCase(o2.getValue().getNome());
    }
}
