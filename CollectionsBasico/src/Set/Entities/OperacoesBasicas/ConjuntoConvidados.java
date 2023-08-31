package Set.Entities.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoConvite){
         convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for(Convidado c: convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadosSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidado(){
        System.out.println(convidadosSet);
    }
}
