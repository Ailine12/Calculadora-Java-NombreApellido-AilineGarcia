// src/test/java/CalculadoraTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testSumar() {
        assertEquals(10, Operaciones.sumar(4, 5));
    }

    @Test
    void testRestar() {
        assertEquals(2, Operaciones.restar(5, 3));
    }

    @Test
    void testMultiplicar() {
        assertEquals(15, Operaciones.multiplicar(3, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, Operaciones.dividir(20, 5));
    }

    @Test
    void testDividirEntreCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Operaciones.dividir(10, 0);
        });
        assertEquals("El divisor no puede ser cero.", exception.getMessage());
    }
}
