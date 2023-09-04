package Desafio;

import java.text.DecimalFormat;

public class Desafio11 {

    public static void main(String[] args) {
        //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista
        DecimalFormat dc = new DecimalFormat("00.000");

        System.out.print("Soma da raiz quadrada de todos os números: " + dc.format(DesafioData.numerosDesafio().stream()
                .map(Math::sqrt)
                .reduce((double) 0, Double::sum)));
    }
}
