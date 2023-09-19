package coutinho.springboot.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetenteBean() {
        System.out.println("CRIANDO OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@beans.com");
        remetente.setNome("Beans Config");
        return remetente;
    }
}
