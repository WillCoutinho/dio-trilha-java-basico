package Application;

import Entities.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        System.out.print("Digite o número da Conta: ");
        int conta = sc.nextInt();
        System.out.print("Informe o seu Nome: ");
        String nome = sc.next();
        System.out.print("Digite o saldo: ");
        Double saldo = sc.nextDouble();
        ContaTerminal ct = new ContaTerminal(agencia, conta, nome, saldo);
        System.out.println("Olá ".concat(ct.getNomeCliente())
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(ct.getAgencia())
                .concat(", conta ")
                .concat(ct.getNumero().toString())
                .concat(" e seu saldo ")
                .concat(ct.getSaldo().toString())
                .concat(" já está disponível para saque"));
    }
}
