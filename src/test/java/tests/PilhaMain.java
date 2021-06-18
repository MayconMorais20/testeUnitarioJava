package tests;

import classes.PilhaTest;

public class PilhaMain {
    public static void main(String[] args) {
        PilhaTest pilhaTest = new PilhaTest();
        boolean resultado;

        resultado = pilhaTest.testeRetiraUltimoLivro();
        System.out.println("testeRetiraUltimoLivro: " + resultado );

        resultado = pilhaTest.testeNaoAdicionaLivroForaPadraoNome();
        System.out.println("testeNaoAdicionaLivroForaPadraoNome: " + resultado );

        resultado = pilhaTest.testeNaoAdiconaAlemLimite();
        System.out.println("testeNaoAdiconaAlemLimite: " + resultado );
    }
}
