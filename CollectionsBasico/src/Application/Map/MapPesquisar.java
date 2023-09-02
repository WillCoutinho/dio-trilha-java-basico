package Application.Map;

import Map.Entities.Pesquisa.EstoqueProdutos;

public class MapPesquisar {

    public static void main(String[] args) {
        EstoqueProdutos ep = new EstoqueProdutos();

        ep.adicionarProduto(1L, "Produto A", 10, 5.0);
        ep.adicionarProduto(2L, "Produto B", 5, 10.0);
        ep.adicionarProduto(3L, "Produto C", 2, 20.0);
        ep.adicionarProduto(4L, "Produto D", 2, 35.0);

        ep.exibirProduto();
        System.out.println("Valor total estoque: R$" + ep.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + ep.obterProdutoMaisCaro());
    }
}
