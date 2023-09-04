package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryExemplo {
    /**
     * Representa operação que combina dois argumentos do tipo T e retorna o resultado do mesmo tipo T.
     * Utilizado para realizar operações de redução de pares de elementos (p.ex.: somar números)
     */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 5);
        BinaryOperator<Integer> soma = (n1, n2) -> n1 + n2;

        int resultado = numeros.stream().reduce(0, soma);
        System.out.println("Resultado: " + resultado);

        int resultadov2 = numeros.stream().reduce(1, (n1, n2) -> n1 * n2);
        System.out.println(resultadov2);
    }
}
