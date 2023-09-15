package entities;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssumptionsTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    @DisplayName("Rodar sob certas condições")
    void validarSomenteSeUsuarioForCoutinho() {
//        String user = "Root";
//        assumeFalse("Coutinho".equals(user));
        assertEquals(10, 5 + 5);
    }
}
