import com.aula4.Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSomar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 e 3 deve ser 5");
    }
}
