package calc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraDiferenteTest {

    @Test
    public void testInverteNumero_simples() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.inverteNumero(1234);
        assertEquals(4321, resultado);
    }

    @Test
    public void testInverteNumero_numeroComZero() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.inverteNumero(1050);
        assertEquals(501, resultado); // zeros à direita são removidos na inversão
    }

    @Test
    public void testFatorial_deCinco() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.fatorial(5);
        assertEquals(120, resultado); // 5*4*3*2*1 = 120
    }

    @Test
    public void testFatorial_deTres() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.fatorial(3);
        assertEquals(6, resultado); // 3*2*1 = 6
    }

    @Test
    public void testSomaDobro_caso1() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.somaDobro(2, 3);
        assertEquals(8, resultado); // 2 + (3*2) = 8
    }

    @Test
    public void testSomaDobro_caso2() {
        CalculadoraDiferente calc = new CalculadoraDiferente();
        int resultado = calc.somaDobro(5, 0);
        assertEquals(5, resultado); // 5 + (0*2) = 5
    }
}
