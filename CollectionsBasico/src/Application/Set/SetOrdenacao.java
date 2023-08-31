package Application.Set;

import Set.Entities.Ordenacao.CadastroProdutos;

public class SetOrdenacao {
    public static void main(String[] args) {
        CadastroProdutos cp = new CadastroProdutos();

        cp.adicionarProduto(1L, "Produto 1", 15d, 5);
        cp.adicionarProduto(2L, "Produto 2", 20d, 10);
        cp.adicionarProduto(1L, "Produto 3", 10d, 2);
        cp.adicionarProduto(9L, "Produto 4", 2d, 2);

        System.out.println(cp.exibirProdutosPorNome());
        System.out.println(cp.exibirProdutosPorPreco());
    }
}
