package Desafio;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio16 {

    public static void main(String[] args) {
        //Desafio 16 - Agrupe os números em pares e ímpares

        Map<Boolean, List<Integer>> mapLista = DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .collect(Collectors.groupingBy(n -> n % 2 == 0, Collectors.toList()));

        System.out.print("Listas agrupada: " + mapLista.values());
        System.out.println();
        System.out.println("Lista de Pares: " + mapLista.get(true));
        System.out.println("Lista de Ímpares: " + mapLista.get(false));

    }
}
