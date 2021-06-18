package classes;

public class CalculadoraTest {
    public boolean testeSoma(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 5;

        //Act
        int resultado = calculadora.somar(2,3);

        //Assert
        return resultadoEsperado == resultado;
    }
    public boolean testeMultiplicacao(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 30;

        //Act
        int resultado = calculadora.multiplicar(6,5);

        //Assert
        return resultadoEsperado == resultado;
    }
    public boolean testeDivisao(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 5;

        //Act
        double resultado = calculadora.dividir(10.0,2.0);

        //Assert
        return resultadoEsperado == resultado;
    }
    public boolean testeSubtracao(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int resultadoEsperado = 10;

        //Act
        int resultado = calculadora.subtrair(15,5);

        //Assert
        return resultadoEsperado == resultado;
    }
}
