package classes;

import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PilhaTestJunit {
    private static Pilha pilha;

    @BeforeClass
    public static void setUpBeforeClass(){
        pilha = new Pilha();
        System.out.println("Executou o BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        pilha = null;
    }

    @Before
    public void setUp(){
        pilha.push(new Livro("A fortaleza"));
        pilha.push(new Livro("A muralha"));
        pilha.push(new Livro("O espantalho"));
        pilha.push(new Livro("A princesa"));
        pilha.push(new Livro("As branquelas"));

    }
    @After
    public void tearDown(){
        int quantidade = pilha.count();
        while (quantidade > 0){
            pilha.pop();
            quantidade--;
        }
    }
    @Test (expected = ArrayStoreException.class)
    public void testeNaoAdiconaAlemLimiteException(){
        pilha.push( new Livro("A gripe"));
    }

    @Test
    public void testeNaoAdiconaAlemLimite(){
        try {
            pilha.push( new Livro("A gripe"));
            Assert.fail();
        }catch (ArrayStoreException e){
            Assert.assertTrue(true);
        }
    }
    @Test
    public void testeRetiraUltimoLivro(){
        Assert.assertEquals(pilha.pop().getTitulo(),"As branquelas");
    }

    @Test (timeout = 40)
    public void testeNaoAdicionaLivroForaPadraoNome(){
        pilha.pop();
        pilha.push(new Livro("Stranger Things"));
        pilha.push(new Livro("A corrida mortal"));

        Assert.assertEquals(pilha.pop().getTitulo(),"A corrida mortal");
    }
}
