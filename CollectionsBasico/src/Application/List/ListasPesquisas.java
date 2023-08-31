package Application.List;

import Listas.Entities.Pesquisa.CatalogoLivros;

public class ListasPesquisas {
    public static void main(String[] args) {
        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro("Livro 1", "Autor 1", 2020);
        cl.adicionarLivro("Livro 1", "Autor 2", 2021);
        cl.adicionarLivro("Livro 2", "Autor 2", 2022);
        cl.adicionarLivro("Livro 3", "Autor 3", 2023);
        cl.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(cl.pesquisarPorAutor("Autor 2"));
        System.out.println(cl.pesquisarPorIntervaloAno(2020, 2021));
        System.out.println(cl.pesquisarPorTitulo("Livro 1"));
    }
}
