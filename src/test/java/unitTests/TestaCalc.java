package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestaCalc {
    @Test (priority = 2)
    public void testarSomarDoisNumeros() {

        // 1 - Preparar - Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);


        // 3 - Validar - Then
        System.out.println("O resultado Esperado = " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);

    }
    @Test (priority = 1)
    public void testarSubDoisNumeros(){
        // 1 - Preparar - Configurar - Given
        int num1 = 12;
        int num2 = 2;
        int resultadoEsperado = 10;

        // 2 - Executar - When
        int resultadoAtual = Calc.subDoisNumeros(num1, num2);


        // 3 - Validar - Then
        System.out.println("O resultado Esperado = " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado,resultadoAtual);
    }
    @Test (priority = 4)
    public void testarmultipDoisNumeros() {
        // 1 - Preparar - Configurar - Given
        int num1 = 12;
        int num2 = 2;
        int resultadoEsperado = 24;

        // 2 - Executar - When
        int resultadoAtual = Calc.multipDoisNumeros(num1, num2);


        // 3 - Validar - Then
        System.out.println("O resultado Esperado = " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test (priority = 3)
    public void testardivDoisNumeros() {
        // 1 - Preparar - Configurar - Given
        int num1 = 12;
        int num2 = 2;
        int resultadoEsperado = 6;

        int resultadoAtual = Calc.divDoisNumeros(num1, num2);

        System.out.println("O resultado Esperado = " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

}
