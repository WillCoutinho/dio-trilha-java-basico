package Application;

import Listas.Entities.Ordenacao.OrdenacaoPessoa;

public class ListasOrdenacao {

    public static void main(String[] args) {
        OrdenacaoPessoa op = new OrdenacaoPessoa();
        op.adicionarPessoa("Nome 1", 20, 1.56);
        op.adicionarPessoa("Nome 2", 30, 1.80);
        op.adicionarPessoa("Nome 3", 25, 1.78);
        op.adicionarPessoa("Nome 4", 35, 1.55);

        System.out.println(op.ordernarPorIdade());
        System.out.println(op.ordernarPorAltura());
    }
}
