package tests;

import classes.RetanguloTest;

public class RetanguloMain {
    public static void main(String[] args) {
        RetanguloTest test = new RetanguloTest();
        boolean resultado;
        resultado = test.testCalcularArea();
        System.out.println(String.format("testCalcularArea: %s", resultado ));
        resultado = test.testCalcularPerimetro();
        System.out.println(String.format("testCalcularPerimetro: %s", resultado ));

    }
}
