package entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    @DisplayName("Validar Exceção de Transferência")
    void validarExcecaoNaTransferencia() {
        Conta origem = new Conta("1234", 0);
        Conta destino = new Conta("4321", 100);

        TransferenciaEntreContas t = new TransferenciaEntreContas();
        assertThrows(IllegalArgumentException.class, () -> {
            t.transferirValoresEntreContas(origem, destino, -1);
        });

        assertDoesNotThrow(() -> {
            t.transferirValoresEntreContas(origem, destino, 2);
        });
    }
}
