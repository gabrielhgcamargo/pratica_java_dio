package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import java.util.*;

public class Lists1 {
    public static void main(String[] args) {
    // CRIAÇÃO DE LISTAS

        List<String> nomes = new ArrayList<>(); // Criação de Lista de Strings vazia;
        List<Double> numeros1 = new ArrayList<>(); // Criação de Lista de Números vazia.

        List<Double> numeros2 = new ArrayList<>(Arrays.asList(7d, 8.1, 10d, 7.7, 21d)); // Criação de Lista com conteúdo (IMUTAVEL)
        List<Double> numeros3 = Arrays.asList(10d, 15.1, 15d, 2.1); // Criação de Lista com conteúdo (IMUTAVEL)

    // Adicionando elementos
        numeros1.add(18d);
        numeros1.add(17.5);
        numeros1.add(12.1);
        numeros1.add(9.9);
        numeros1.add(10d); // só adiciona o valor na lista.
        numeros1.add(1, 20d); // adiciona o valor no índice informado.

    // Imprimindo Listas
        System.out.println(numeros1);
        System.out.println(numeros1.toString());

    // Encontrar índice do elemento específico
        numeros1.indexOf(10d);

    // Substituir um elemento por outro
        numeros1.set(numeros1.indexOf(10d), 10.5);

    // Boolean se existe um elemento na lista
        System.out.println(numeros1.contains(17d));

    // Exibir elementos na ordem de inserção
        for (Double num: numeros1) System.out.println(num);

    // Encontrar um elemento de uma posição específica da Lista
        numeros1.get(1);

    // Encontrar o menor elemento
        Collections.min(numeros1);

    // Encontrar o maior elemento
        Collections.max(numeros1);

    // Calcular a soma dos valores da Lista
        Iterator<Double> iterator = numeros1.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }

    // Calcular a media dos valores da Lista
        Double media = soma/numeros1.size();

    // Remover um Elemento o informando
        numeros1.remove(20d);

    // Remover um elemento passando a posição
        numeros1.remove(0);

    // Remover todos os elementos que respeitem ou não uma condição.
        // - No exemplo, remover todos os elementos menores que 10d
        Iterator<Double> iterator1 = numeros1.iterator();
        while (iterator1.hasNext()){
            Double next1 = iterator1.next();
            if(next1 < 10d) iterator1.remove();
        }

    // Apagar toda a Lista
        numeros1.clear();

    // Boolean que confere se a Lista está vazia
        numeros1.isEmpty();
    }
}

