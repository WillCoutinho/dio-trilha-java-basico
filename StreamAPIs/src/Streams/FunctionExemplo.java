package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExemplo {
    /**
     * Representa uma função que aceita o argumento  do tipo T e retorna um resultado do tipo R.
     * Utilizado para transformar ou mapear os elementos do stream em outros valores do tipo.
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Function<Integer, Double> dobrar = numero -> (double) (numero * 2);

        List<Double> numerosDobradosDouble = numeros.stream().map(dobrar).toList();
        numerosDobradosDouble.forEach(System.out::println);

        System.out.println("-".repeat(30));
        List<Integer> numerosTriplicados = numeros.stream().map(n -> n * 3).toList();
        numerosTriplicados.forEach(System.out::println);
    }
}
