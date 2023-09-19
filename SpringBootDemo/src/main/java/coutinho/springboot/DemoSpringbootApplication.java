package coutinho.springboot;

import coutinho.springboot.app.SistemaMensagem;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringbootApplication.class, args);
    }
//
//    @Bean
//    public CommandLineRunner run(SistemaMensagem sistemaMensagem) throws Exception {
//        return args -> {
//            sistemaMensagem.enviarMensagemBoasVindas();
//            sistemaMensagem.enviarConfirmacaoCadastro();
//        };
//    }
}
