package Desafio;

import java.util.function.Consumer;

public class Desafio03 {

    public static void main(String[] args) {
        // Desafio 3 - Verifique se todos os números da lista são positivos
        System.out.println("Todos os números são positivos?");
        System.out.print(DesafioData.numerosDesafio().stream()
                .distinct()
                .allMatch(n -> n > 0));
    }
}
