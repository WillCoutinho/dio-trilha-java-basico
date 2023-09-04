package Desafio;

import Streams.FunctionExemplo;

import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Desafio05 {

    public static void main(String[] args) {
        //Desafio 5 - Calcule a média dos números maiores que 5

        System.out.println("Média dos números maiores que 5: " + DesafioData.numerosDesafio().stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new RuntimeException("Erro ao calcular média")));
    }
}
