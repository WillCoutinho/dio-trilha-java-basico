package coutinho.webapi.repository;

import coutinho.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario user) {
        System.out.println("SAVE - Recebendo usuário na camada repository");
        System.out.println(user);
    }

    public void update(Integer id, Usuario usuario) {
        System.out.printf("UPDATE - Recebendo o usuário %s com id %s na camada de repositório", usuario, id);
        System.out.println(usuario);
    }

    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d", id);
        System.out.println(id);
    }

    public Usuario findById(Integer id) {
        System.out.printf("FIND/id - Recenbendo o id: %d", id);
        return new Usuario("Coutinho", "1234");
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando usuários do sistema");
        List<Usuario> users = new ArrayList<>();
        users.add(new Usuario("Coutinho", "1234"));
        users.add(new Usuario("William", "4321"));
        return users;
    }

    public Usuario findByUsername(String username) {
        System.out.printf("FIND/username - Recebendo o usuário: %s", username);
        return new Usuario(username, "1234");
    }
}
