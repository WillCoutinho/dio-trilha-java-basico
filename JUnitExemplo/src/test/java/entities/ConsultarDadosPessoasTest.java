package entities;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosPessoasTest {

    @BeforeAll
    static void configurarConexao() {
        GerenciadorBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void inserirDadosParaTeste(){
        GerenciadorBancoDeDados.inserirDados(new Pessoa("Nova Pessoa", LocalDateTime.now()));
    }

    @Test
    @DisplayName("Validar Dados de Retorno")
    void validarDadosDeRetorno() {
        Pessoa pessoa = new Pessoa("Teste", LocalDateTime.now());
        assertNotNull(pessoa);
    }


    @AfterEach
    void removerDadosParaTeste(){
        GerenciadorBancoDeDados.removerDados(new Pessoa("Nova Pessoa", LocalDateTime.now()));
    }

    @AfterAll
    static void finalizarConexao() {
        GerenciadorBancoDeDados.finalizarConexao();
    }


}
