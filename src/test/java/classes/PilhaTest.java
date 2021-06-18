package classes;

import classes.Livro;
import classes.Pilha;

public class PilhaTest {

    public boolean testeRetiraUltimoLivro(){
        Pilha pilha = new Pilha();

        Livro livro = new Livro("A fortaleza");
        pilha.push(livro);

        livro = new Livro("A emboscada");
        pilha.push(livro);

        livro = new Livro("A cilada");
        pilha.push(livro);

        String resultadoEsperado = "A cilada";

        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }

    public boolean testeNaoAdiconaAlemLimite(){
        Pilha pilha = new Pilha();
        Livro livro  = new Livro("A fortaleza");
        Livro livro1 = new Livro("A muralha");
        Livro livro2 = new Livro("O espantalho");
        Livro livro3 = new Livro("A princesa");
        Livro livro4 = new Livro("As branquelas");
        Livro livro5 = new Livro("DBZ");

        pilha.push(livro);
        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);
        pilha.push(livro5);

        String resultadoEsperado = "As branquelas";
        return pilha.pop().getTitulo().equals(resultadoEsperado);

    }
    public boolean testeNaoAdicionaLivroForaPadraoNome(){
        Pilha pilha = new Pilha();
        Livro livro = new Livro("A fortaleza");
        pilha.push(livro);
        Livro livro2 = new Livro("Stranger Things");
        pilha.push(livro2);

        String resultadoEsperado = "A fortaleza";

        return pilha.pop().getTitulo().equals(resultadoEsperado);
    }

}
