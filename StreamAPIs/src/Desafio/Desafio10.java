package Desafio;

public class Desafio10 {

    public static void main(String[] args) {
        //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5

        System.out.println(DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(n -> n % 2 != 0)
                .filter(m -> m % 3 == 0 || m % 5 == 0 )
                .toList());
    }
}
