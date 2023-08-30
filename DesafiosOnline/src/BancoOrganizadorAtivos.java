import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        double valor = 500.50;
        double saldo = 0;
        DecimalFormat df = new DecimalFormat("####.00");

        while (valor != 0) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + df.format(saldo));
            } else if (valor < 0) {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            } else {
                System.out.println("Encerrando o programa...");
                break;
            }
            valor = 0;
        }

    }

    static ArrayList<String> ordenarLista(ArrayList<String> lista) {
        lista.sort(String::compareTo);
        return lista;
    }

    static void imprimirLista(ArrayList<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    static void saque(int saldo, int valorSaque) {
        if (saldo < valorSaque) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        } else {
            System.out.println("Saque realizado com sucesso! Novo saldo: " + (saldo - valorSaque));
        }
    }

    static double calculoTaxaJuros(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial;
        for (int i = 0; i < periodo; i++) {
            valorFinal = valorFinal + (valorFinal * taxaJuros);
        }
        return valorFinal;
    }
}