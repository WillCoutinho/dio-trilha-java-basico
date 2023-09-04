package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    /**
     * Representa função que aceita argumento do tipo T e retorna um valor booleano
     * Usado para filtrar elementos do Stream com base na condição
     */
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C#", "Go", "Ruby");

        Predicate<String> maisDeCincoChars = palavra -> palavra.length() > 5;

        System.out.println("Palavras com mais de 5 chars");
        palavras.stream().filter(maisDeCincoChars).forEach(System.out::println);

        System.out.println("-".repeat(30));
        System.out.println("Palavras com mais de 7 chars");
        palavras.stream().filter(p -> p.length() > 7).forEach(System.out::println);
    }
}
