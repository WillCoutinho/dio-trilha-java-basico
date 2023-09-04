package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExemplo {
    /**
     * Representa uma operação que não aceita argumento e que retorna um resultado do tipo T.
     * É utilizado para criar ou fornecer novos objetos de um determinado tipo
     */
    public static void main(String[] args) {

        Supplier<String> saudacao = () -> "Olá, seja bem vindo";
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(3)
                .toList();

        List<String> listaSaudacaov2 = Stream.generate(() -> "Bem vindo!").limit(2).toList();

        listaSaudacoes.forEach(System.out::println);
        listaSaudacaov2.forEach(System.out::println);
    }
}
