package entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    @DisplayName("Validar cálculo da idade")
    void validarCalculoIdade() {
        Pessoa pessoa = new Pessoa("Couts",
                LocalDateTime.of(1991, 11, 16, 0, 0, 0));
        Assertions.assertEquals(31, pessoa.getIdade());
    }

    @Test
    @DisplayName("Validar se é maior de idade")
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa1 = new Pessoa("Couts",
                LocalDateTime.of(1991, 11, 16, 0, 0, 0));

        Pessoa pessoa2 = new Pessoa("João",
                LocalDateTime.of(2023, 1, 1, 0, 0, 0));
        Assertions.assertTrue(pessoa1.getIdade() >= 18);
        Assertions.assertTrue(pessoa2.getIdade() < 18);
    }
}
