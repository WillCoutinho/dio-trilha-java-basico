package com.coutinho.springdatajpa;

import com.coutinho.springdatajpa.model.Usuario;
import com.coutinho.springdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;

    @Override
    public void run(String... args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setName("Coutinho");
        usuario.setUsername("little_couto");
        usuario.setPassword("abc@1234");
        userRepo.save(usuario);

        for (Usuario u : userRepo.findAll()) {
            System.out.println(u);
        }
    }
}
