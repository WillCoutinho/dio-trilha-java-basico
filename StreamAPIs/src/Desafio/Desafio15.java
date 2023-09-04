package Desafio;

public class Desafio15 {

    public static void main(String[] args) {
        //Desafio 15 - Verifique se a lista contém pelo menos um número negativo

        System.out.println("Quantidade de números negativos na lista: " + DesafioData.numerosDesafio().stream()
                .filter(n -> n < 0)
                .toList()
                .size());
    }
}
