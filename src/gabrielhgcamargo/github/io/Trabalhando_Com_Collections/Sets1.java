package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Sets1 {

    public static void main(String[] args) {


        // Criação de um conjunto
        Set<Double> numero = new HashSet<>();
        Set<Double> numeros1 = new HashSet<>(Arrays.asList(1d, 2d, 3d, 4d, 5d, 6d, 7d, 8d));

        // Imprimindo
        System.out.println(numero);
        System.out.println(numeros1.toString());

        // Adicionar elementos
        numero.add(1d);
        numero.add(1d); // SET NÃO ACEITA NÚMERO REPETIDO/DUPLICADO !!!

        // Impossível exibir elemento de uma posição específica, POIS NÃO TEM ÍNDICE EM SET.

        // Impossível adicionar um elemento em uma posição específica, POIS NÃO TEM ÍNDICE EM SET.

        // Impossível substituir um elemento por outro em específico.

        // Boolean se existe o elemento no conjunto
        System.out.println(numeros1.contains(15d));

        // Exibir o menor elemento
        System.out.println(Collections.min(numeros1));

        // Exibir o maior elemento
        System.out.println(Collections.max(numeros1));

        // Exibir a soma dos elementos
        Iterator<Double> iterator = numeros1.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma+= iterator.next();
        }
        System.out.println("SOMA = " + soma);

        // Exibir a média dos elementos
        System.out.println("Media = " + (soma/numeros1.size()));

        // Remover um elemento específico
        numeros1.remove(7.0);

        // Impossível remover um elemento por índice, POIS SET NÃO TEM ÍNDICE.

        // Remover elementos que atendam ou não uma condição
        // Exemplo : remover menores que 5
        Iterator<Double> iterator1 = numeros1.iterator();
        while (iterator1.hasNext()){
            if(iterator1.next() < 5d) iterator1.remove();
        }


        // Exibir elementos na ordem em que foram informados
        // Para isso, temos que trabalhar com LinkedHashSet, pois organiza de acordo com a ordem natural dos elementos.
        Set<Double> numeros2 = new LinkedHashSet<>(Arrays.asList(100d, 105d, 110d, 115d, 120d));
        System.out.println(numeros2);

        // Exibir na ordem crescente
        // Para isso, utilizar o TreeSet
        Set<Double> numeros3 = new TreeSet<>(Arrays.asList(1d, 2d, 7d, 10d, 75d, 3d));
        System.out.println(numeros3);

        // Boolean que verifica se o Set/Conjunto está vazio
        System.out.println(numeros1.isEmpty());

    }
}
