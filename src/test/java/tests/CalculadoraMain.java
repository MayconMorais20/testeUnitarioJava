package tests;

import classes.Calculadora;
import classes.CalculadoraTest;

public class CalculadoraMain {
    public static void main(String[] args) {
        CalculadoraTest calculadoraTest = new CalculadoraTest();
        boolean resultado;

        resultado = calculadoraTest.testeSoma();
        System.out.println("calculadoraTest: " + resultado );
        resultado = calculadoraTest.testeSubtracao();
        System.out.println("testeSubtracao: " + resultado );
        resultado = calculadoraTest.testeMultiplicacao();
        System.out.println("testeMultiplicacao: " + resultado );
        resultado = calculadoraTest.testeDivisao();
        System.out.println("testeMultiplicacao: " + resultado );

    }
}
