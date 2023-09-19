package coutinho.springboot.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesScan
public class SistemaMensagemV3 implements CommandLineRunner {

    @Autowired
    private RemetenteBean rbean;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + rbean.getNome()
                + "\nEmail: " + rbean.getEmail()
                + "\nCom telefones para contato: " + rbean.getTelefones());

        System.out.println("Cadastro aprovado");
    }
}
