package Desafio;

import Streams.FunctionExemplo;

import java.util.Arrays;
import java.util.function.Function;

public class Desafio08 {

    public static void main(String[] args) {
        //Desafio 8 - Somar os valores de todos os números da lista
        System.out.println("Somatória dos valores da lista: " + DesafioData.numerosDesafio().stream()
                .reduce(0, Integer::sum));
    }
}
