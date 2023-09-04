package Desafio;

import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio02 {
    public static void main(String[] args) {
        //Desafio 2 - Imprima a soma dos números pares da lista

        System.out.println("Soma dos números pares: " + DesafioData.numerosDesafio().stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum));
    }
}
