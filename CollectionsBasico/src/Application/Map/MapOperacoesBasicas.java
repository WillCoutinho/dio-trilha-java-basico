package Application.Map;


import Map.Entities.OperacoesBasicas.AgendaContatosMap;

public class MapOperacoesBasicas {

    public static void main(String[] args) {
        AgendaContatosMap ac = new AgendaContatosMap();

        ac.adicionarContato("Camila", 123456);
        ac.adicionarContato("Camila", 5665);
        ac.adicionarContato("Camila Cavalcanti", 111111);
        ac.adicionarContato("Camila Dio", 654987);
        ac.adicionarContato("Maria Silva", 111111);
        ac.adicionarContato("Camila", 44444);

        ac.exibirContato();

        System.out.println("Telefone encontrado: " + ac.pesquisarTelefonePorNome("Maria Silva"));

    }
}
