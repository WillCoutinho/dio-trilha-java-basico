package entities;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemDosCenarios {

    @Test
    @Order(3)
    @DisplayName("Fluxo A")
    void validarFluxoA() {
        assertTrue(true);
    }

    @Test
    @Order(2)
    @DisplayName("Fluxo B")
    void validarFluxoB() {
        assertTrue(true);
    }

    @Test
    @Order(1)
    @DisplayName("Fluxo C")
    void validarFluxoC() {
        assertTrue(true);
    }
}
