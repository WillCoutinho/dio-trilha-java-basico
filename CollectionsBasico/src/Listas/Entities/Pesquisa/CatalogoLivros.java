package Listas.Entities.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(l);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoPublicacaoInicial, int anoPublicacaoFinal) {
        List<Livro> listaPorIntervaloAno = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro l : listaLivros) {
                if (l.getAnoPublicacao() >= anoPublicacaoInicial && l.getAnoPublicacao() <= anoPublicacaoFinal) {
                    listaPorIntervaloAno.add(l);
                }
            }
        }
        return listaPorIntervaloAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro lv = null;
        for (Livro l : listaLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                lv = l;
                break;
            }
        }
        return lv;
    }
}
