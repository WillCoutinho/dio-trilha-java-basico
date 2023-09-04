package Desafio;

public class Desafio17 {

    public static void main(String[] args) {
        //Desafio 17 - Filtrar os números primos da lista
        System.out.println("Lista de números primos: " + DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(a -> a > 1)
                .filter(b -> b % 2 != 0 || b == 2)
                .filter(c -> c % 3 != 0 || c == 3)
                .toList());
    }
}
