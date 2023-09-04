package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Desafio18 {

    public static void main(String[] args) {
        //Desafio 18 - Verifique se todos os números da lista são iguais

        List<Integer> testeDesafio = List.of(1, 1, 1, 1, 1);
        System.out.println("Todos os números são iguais?");
        System.out.print(DesafioData.numerosDesafio().stream()
                .distinct()
                .count() <= 1);
    }
}
