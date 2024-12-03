package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testEdadValida() {
        Paciente paciente = new Paciente("Juan", 25, "P12345");
        try {
            paciente.verificarEdad();
        } catch (RangoException e) {
            fail("No se esperaba una excepcion para una edad valida.");
        }
    }

    @Test
    void testEdadNegativa() {
        Paciente paciente = new Paciente("Maria", -5, "P12346");
        try {
            paciente.verificarEdad();
            fail("Se esperaba una excepción para una edad negativa.");
        } catch (RangoException e) {
            assertEquals("Edad no válida: -5", e.getMessage());
        }
    }

    @Test
    void testEdadMayorQueLimiteSuperior() {
        Paciente paciente = new Paciente("Pedro", 130, "P12347");
        try {
            paciente.verificarEdad();
            fail("Se esperaba una excepcion para una edad mayor que el limite superior.");
        } catch (RangoException e) {
            assertEquals("Edad no válida: 130", e.getMessage());
        }
    }

    @Test
    void testEdadEnLimiteSuperior() {
        Paciente paciente = new Paciente("Ana", 120, "P12348");
        try {
            paciente.verificarEdad();
        } catch (RangoException e) {
            fail("No se esperaba una excepciin para una edad en el limite superior.");
        }
    }

    
}