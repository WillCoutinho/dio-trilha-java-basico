package coutinho.webapi.repository;

import coutinho.webapi.handler.BusinessException;
import coutinho.webapi.model.Usuario;

import static coutinho.webapi.model.UsuarioExceptionHandler.*;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario user) {
        if (camposNaoPreenchidosCorretamente(user)) {
            throw new BusinessException("O campo username/password são obrigatórios");
        }
        System.out.println("SAVE - Recebendo usuário na camada repository");
        System.out.println(user);
    }

    public void update(Integer id, Usuario user) {
        if (camposNaoPreenchidosCorretamente(user)) {
            throw new BusinessException("O campo username/password são obrigatórios");
        }
        if (idMenorIgualZero(id)) {
            throw new BusinessException("O ID deve ser válido");
        }
        System.out.println();
        System.out.printf("UPDATE - Recebendo o usuário %s com id %d na camada de repositório", user.getUsername(), id);
    }

    public void deleteById(Integer id) {
        if (idMenorIgualZero(id)) {
            throw new BusinessException("O ID deve ser válido");
        }
        System.out.printf("DELETE/id - Recebendo o id: %d", id);
        System.out.println();
    }

    public Usuario findById(Integer id) {
        if (idMenorIgualZero(id)) {
            throw new BusinessException("O ID deve ser válido");
        }
        System.out.println();
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
        if (campoComValorInvalido(username)) {
            throw new BusinessException("Username deve ser válido");
        }
        System.out.println();
        System.out.printf("FIND/username - Recebendo o usuário: %s", username);
        return new Usuario(username, "1234");
    }
}
