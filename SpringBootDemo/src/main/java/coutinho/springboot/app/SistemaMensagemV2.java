package coutinho.springboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Component
public class SistemaMensagemV2 implements CommandLineRunner {
    @Value("${nome:NoReply-emailDefault}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nEmail: " + email
                + "\nCom telefones para contato: " + telefones);

        System.out.println("Cadastro aprovado");
    }
}
