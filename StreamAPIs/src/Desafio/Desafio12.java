package Desafio;

import java.text.DecimalFormat;

public class Desafio12 {

    public static void main(String[] args) {
        //Desafio 12 - Encontre o produto de todos os números da lista
        DecimalFormat decimalFormat = new DecimalFormat("000,000");
        System.out.println("Produto de todos os números: " + decimalFormat.format(DesafioData.numerosDesafio().stream()
                .reduce(1, (n1, n2) -> n1 * n2).doubleValue()));
    }
}
