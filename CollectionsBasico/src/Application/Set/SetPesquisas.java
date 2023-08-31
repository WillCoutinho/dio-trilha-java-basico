package Application.Set;

import Set.Entities.Pesquisa.AgendaContatos;

public class SetPesquisas {

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Camila", 123456);
        ac.adicionarContato("Camila", 0);
        ac.adicionarContato("Camila Cavalcanti", 111111);
        ac.adicionarContato("Camila Dio", 654789);
        ac.adicionarContato("Maria Silva", 111111);
        ac.exibirContato();
        System.out.println(ac.pesquisarPorNome("Maria"));

        System.out.println("Contato atualizado: " + ac.atualizarNumeroContato("Maria Silva", 555555));
        ac.exibirContato();
    }
}
