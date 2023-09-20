package coutinho.webapi.controller;

import coutinho.webapi.model.Usuario;
import coutinho.webapi.repository.UsuarioRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "API Usuários")
public class UsuarioController {

    @Autowired
    private UsuarioRepository userRepo;

    @Operation(description = "Persiste um Usuário")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Usuário persistido com sucesso"),
            @ApiResponse(responseCode = "500", description = "Exceção não tratada.")
    })
    @PostMapping("")
    public ResponseEntity<String> postUser(@RequestBody Usuario user) {
        userRepo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário persistido com sucesso");
    }

    @Operation(description = "Atualiza um Usuário")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário atualizado com sucesso"),
            @ApiResponse(responseCode = "500", description = "Exceção não tratada.")
    })
    @PatchMapping("/{id}")
    public ResponseEntity<String> patch(@PathVariable("id")
                                        @Parameter(name = "id",
                                                description = "ID do Usuário a ser atualizado",
                                                example = "1")
                                        Integer id,
                                        @RequestBody Usuario usuario) {
        userRepo.update(id, usuario);
        return ResponseEntity.ok("Usuário atualizado com sucesso");
    }

    @Operation(description = "Retorna todos os Usuários cadastrados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuários disponíveis na base"),
            @ApiResponse(responseCode = "500", description = "Exceção não tratada.")
    })
    @GetMapping("")
    public ResponseEntity<List<Usuario>> getUsers() {
        return ResponseEntity.ok(userRepo.findAll());
    }

    @Operation(description = "Retorna um Usuário com base no Username")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário retornado com base no Username"),
            @ApiResponse(responseCode = "500", description = "Exceção não tratada.")
    })
    @GetMapping("/{username}") //Assim podemos usar o parâmetro informado na URI
    public ResponseEntity<Usuario> getUserByUsername(@PathVariable("username")
                                                     @Parameter(name = "username",
                                                             description = "Username do Usuário",
                                                             example = "user@name")
                                                     String username) {
        return ResponseEntity.ok(userRepo.findByUsername(username));
    }

    @Operation(description = "Remove um Usuário pelo ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário removido com sucesso"),
            @ApiResponse(responseCode = "500", description = "Exceção não tratada.")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id")
                                             @Parameter(name = "id",
                                                     description = "ID do Usuário",
                                                     example = "1")
                                             Integer id) {
        userRepo.deleteById(id);
        return ResponseEntity.ok("Usuário removido com sucesso");
    }
}
