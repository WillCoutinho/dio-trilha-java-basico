package Map.Entities.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProduto;

    public EstoqueProdutos() {
        this.estoqueProduto = new HashMap<>();
    }

    public void adicionarProduto(long codigoProduto, String nome, int quantidade, double preco) {
        estoqueProduto.put(codigoProduto, new Produto(nome, quantidade, preco));
    }

    public void exibirProduto() {
        System.out.println(estoqueProduto);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;

        if (!estoqueProduto.isEmpty()) {
            for (Produto p : estoqueProduto.values()) {
                valorTotalEstoque += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        double maiorValorEstoque = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        for (Produto p : estoqueProduto.values()) {
            if (p.getPreco() > maiorValorEstoque) {
                maiorValorEstoque = p.getPreco();
                produtoMaisCaro = p;
            }
        }
        return produtoMaisCaro;
    }


}
