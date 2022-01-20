package gabrielhgcamargo.github.io.Trabalhando_Com_Collections;

import java.util.*;

//CHAVE e VALOR
public class Maps {
    public static void main(String[] args) {

        //Criando um Map
        Map<String, Double> carros = new HashMap<>(){{
            put("Honda Civic", 7.8);
            put("Honda WRV", 13.5);
            put("Lambo Aventador", 5.1);
            put("Jeep Renegade", 8.0);
        }};

        //Imprimindo um Map
        System.out.println(carros);
        // ou
        System.out.println(carros.toString());


        // Substituir um valor // informando a chave
        carros.put("Honda WRV", 14d);
        System.out.println(carros);

        // Conferir se existe uma chave
        System.out.println(carros.containsKey("Honda WRV"));

        // Exibir um valor de uma chave
        System.out.println(carros.get("Honda WRV"));

        // Exibir apenas as chaves
        System.out.println(carros.keySet());

        // Exibir apenas os valores
        System.out.println(carros.values());

        // Exibir o maior valor
        System.out.println(Collections.max(carros.values()));

        // Exibir o menor valor
        System.out.println(Collections.min(carros.values()));

        // Exibir na ordem de inserção
        Map<String, Double> carros2 = new LinkedHashMap<>(){{
            put("Honda Civic", 7.8);
            put("Honda WRV", 13.5);
            put("Lambo Aventador", 5.1);
            put("Jeep Renegade", 8.0);
        }};

        System.out.println(carros2);

        // Exibir na ordem das chaves / no exemplo : ordem dos modelos
        Map<String, Double> carros3 = new TreeMap<>(){{
            put("Honda Civic", 7.8);
            put("Honda WRV", 13.5);
            put("Lambo Aventador", 5.1);
            put("Jeep Renegade", 8.0);
        }};
        System.out.println(carros3);


        // Apagar
        carros.clear();
        System.out.println(carros);

        // Boolean que verifica se está vazio
        System.out.println(carros.isEmpty());
    }
}
