package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
    /**
     * Representa operação que aceita um argumento do tipo T e não retorna resultado (void)
     * Utilizado para realizar ações ou efeitos colaterais nos elementos do Stream sem modificar ou retornar valor
     */

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        };
        System.out.println("Números Pares");
        nums.forEach(imprimirNumeroPar);
        System.out.println();
        System.out.println();
        System.out.println("Números Ímpares");
        nums.forEach(n -> {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        });
    }
}
