package Desafio;

public class Desafio06 {

    public static void main(String[] args) {
        //Desafio 6 - Verificar se a lista contém algum número maior que 10

        System.out.println("Algum número maior que 10?");
        System.out.print(DesafioData.numerosDesafio().stream()
                .distinct()
                .anyMatch(n -> n > 10)
        );
    }
}
