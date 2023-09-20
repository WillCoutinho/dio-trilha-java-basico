package coutinho.webapi.model;

public class UsuarioExceptionHandler {

    public static boolean camposNaoPreenchidosCorretamente(Usuario usuario) {
        return (usuario.getUsername() == null || usuario.getPassword() == null);
    }

    public static boolean idMenorIgualZero(Integer id){
        return id <= 0;
    }

    public static boolean campoComValorInvalido(String campo){
        return campo == null || campo.isEmpty() || campo.isBlank();
    }
}
