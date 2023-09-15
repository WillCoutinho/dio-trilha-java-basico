package entities;

import java.util.logging.Logger;

public class GerenciadorBancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(GerenciadorBancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciou conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizou conexão");
    }

    public static void inserirDados(Pessoa pessoa) {
        LOGGER.info("Dados inseridos");
    }

    public static void removerDados(Pessoa pessoa) {
        LOGGER.info("Dados removidos");
    }
}
