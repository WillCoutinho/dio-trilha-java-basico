package Desafio;

import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Collectors;

public class Desafio09 {

    public static void main(String[] args) {
        //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem)

        System.out.println("Lista possui números distintos?");
        System.out.print(DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .toList().size() == DesafioData.numerosDesafio().size());
    }
}
