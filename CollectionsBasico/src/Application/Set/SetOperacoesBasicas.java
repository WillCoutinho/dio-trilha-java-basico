package Application.Set;

import Set.Entities.OperacoesBasicas.ConjuntoConvidados;

public class SetOperacoesBasicas {

    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();
        cc.adicionarConvidadoSet("Convidado 1", 1234);
        cc.adicionarConvidadoSet("Convidado 2", 1235);
        cc.adicionarConvidadoSet("Convidado 3", 1235);
        cc.adicionarConvidadoSet("Convidado 4", 1237);
        System.out.println("Existem " + cc.contarConvidados() + " convidado(s) dentro do Set de convidados");
        cc.exibirConvidado();

        cc.removerConvidadoPorCodigoConvite(1234);
        cc.exibirConvidado();


    }
}
