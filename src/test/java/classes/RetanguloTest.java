package classes;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RetanguloTest {
    private Retangulo retangulo;
    private int base;
    private int area;
    private int altura;

    @Parameterized.Parameters
    public static Collection<Object[]> paremetros(){
        return Arrays.asList(new Object[][]{
                {10, 20, 200},
                {10, 10, 100},
                {10, 11, 110},
                {10, 30, 300}
        });
    }
    public RetanguloTest(int base, int altura, int area){
        this.base = base;
        this.altura = altura;
        this.area = area;
    }
    @Test
    public void testCalcularArea(){
        retangulo = new Retangulo(base,altura);
        Assert.assertEquals(area, retangulo.calcularArea());
    }
    @Ignore
    public void testCalcularPerimetro(){
        retangulo = new Retangulo(10,2);
        Assert.assertEquals(area, retangulo.calcularPerimetro());
    }

}
