package entities;

public class TransferenciaEntreContas {

    public void transferirValoresEntreContas(Conta origem, Conta destino, double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }
}
