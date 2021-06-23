package tests;

import classes.Calculadora;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculadoraTestJunit {
    @Test
    public void testeSomar(){
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(4,10);

        assertEquals(14, resultado);
    }
    @Test
    public void testeDivisao(){
        Calculadora calculadora = new Calculadora();
        double resultadoEsperado = 2.0;

        double resultado = calculadora.dividir(20.0,10.0);

        assertTrue(resultado == resultadoEsperado);
    }
    @Ignore
    public void testeMultiplicacao(){
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(2,10);

        assertEquals(20, resultado);
    }
}
