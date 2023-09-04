package Desafio;

public class Desafio13 {

    public static void main(String[] args) {
        //Desafio 13 - Filtrar os números que estão dentro de um intervalo
        int filtroInicial = 5;
        int filtroFinal = 10;

        System.out.println("Valores filtrados entre " + filtroFinal + " e " + filtroFinal);
        System.out.print(DesafioData.numerosDesafio().stream()
                .sorted()
                .distinct()
                .filter(n -> n >= filtroInicial && n <= filtroFinal)
                .toList());
    }
}
