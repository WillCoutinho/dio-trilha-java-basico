package Application;

import Listas.Entities.OperacoesBasicas.ListaTarefas;

public class ListasOperacoesBasicas {

    public static void main(String[] args) {
        ListaTarefas lt = new ListaTarefas();
        lt.adicionarTarefa("Teste");
        lt.adicionarTarefa("teste");
        lt.adicionarTarefa("TESTE");
        lt.adicionarTarefa("Novo primeiro elemento");
        lt.adicionarTarefa("Segundo elemento");

        System.out.println("Tamanho da lista antes de remover Teste (três repetidos): " + lt.obterNumeroTotalTarefas());
        lt.removerTarefa("teste");
        System.out.println("Tamanho da lista depois de remover Teste: " + lt.obterNumeroTotalTarefas());

        System.out.print("Descrições das tarefas restantes: " + lt.obterDescricoesTarefas());
    }
}
