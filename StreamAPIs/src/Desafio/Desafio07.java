package Desafio;

import java.util.Comparator;

public class Desafio07 {

    public static void main(String[] args) {
        //Desafio 7 - Encontrar o segundo número maior da lista

        System.out.print("Segundo maior número da lista: " + DesafioData.numerosDesafio().stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null));
    }
}
