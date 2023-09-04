package Desafio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.function.Predicate;

public class Desafio19 {

    public static void main(String[] args) {
        //Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5

        List<Integer> testeDesafio = new ArrayList<>(DesafioData.numerosDesafio());
        testeDesafio.add(45);
        Predicate<Integer> filtroDivisivel = numero -> numero % 3 == 0 || numero % 5 == 0;

        System.out.println("Lista de valores divisíveis por 3 e 5: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(filtroDivisivel)
                .toList());

        System.out.println("Soma dos valores divisíveis por 3 e 5: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(filtroDivisivel)
                .reduce(0, Integer::sum));
    }
}
