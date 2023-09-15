package entities;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTest {

    @Test
    @DisplayName("Validar se arrays são diferentes")
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 2, 3, 10};

        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    @DisplayName("Validar se objeto é nulo")
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Fulano", LocalDateTime.now());
        assertNotNull(pessoa);
    }

    @Test
    @DisplayName("Validar números de tipos diferentes")
    void validarNumerosDeTiposDiferentes() {
        double valor = 5.0;
        int outroValor = 5;

        assertEquals(valor, outroValor);
    }
}
