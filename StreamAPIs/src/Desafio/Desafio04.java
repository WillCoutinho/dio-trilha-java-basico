package Desafio;

public class Desafio04 {

    public static void main(String[] args) {
        //Desafio 4 - Remova todos os valores ímpares

        System.out.println("Removido valores ímpares da lista: " + DesafioData.numerosDesafio().stream()
                .filter(n -> n % 2 == 0)
                .toList());
    }
}
