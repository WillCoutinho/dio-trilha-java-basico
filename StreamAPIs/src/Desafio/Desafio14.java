package Desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Desafio14 {

    public static void main(String[] args) {
        //Desafio 14 - Encontre o maior número primo da lista

        List<Integer> listaTestePrimos = Stream.iterate(1, n -> n + 1).limit(100).toList();
        System.out.println("Lista de números primos: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(a -> a > 1)
                .filter(b -> b % 2 != 0 || b == 2)
                .filter(c -> c % 3 != 0 || c == 3)
                .toList());

        System.out.print("Maior número primo: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(a -> a > 1)
                .filter(b -> b % 2 != 0 || b == 2)
                .filter(c -> c % 3 != 0 || c == 3)
                .max(Integer::compare)
                .orElse(null)
        );

    }
}
