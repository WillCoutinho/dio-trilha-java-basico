package Listas.Entities.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public Tarefa(String desc) {
        this.descricao = desc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
