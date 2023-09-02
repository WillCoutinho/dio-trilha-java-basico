package Map.Entities.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatosMap {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatosMap() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarTelefonePorNome(String nome) {
        Integer numeroTelefone = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroTelefone = agendaContatoMap.get(nome);
        }
        return numeroTelefone;
    }
}
