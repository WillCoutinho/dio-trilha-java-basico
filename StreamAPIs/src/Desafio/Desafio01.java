package Desafio;

import java.util.Comparator;
import java.util.List;

public class Desafio01 {
    public static void main(String[] args) {
        //Desafio 1 - Mostre a lista na ordem numérica
        System.out.println("Lista em ordem numérica: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .toList());
    }
}
