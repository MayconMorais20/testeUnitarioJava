package classes;

import java.util.ArrayList;

public class Pilha {

    private int limite = 5;
    private ArrayList<Livro> pilha = new ArrayList<Livro>();

    public void push(Livro livro){
        if (pilha.size() >= limite){
            throw new ArrayStoreException();
        }
        if (! livro.getTitulo().startsWith("A") && ! livro.getTitulo().startsWith("O")){
            return;
        }
        pilha.add(livro);
    }
    public Livro pop(){
        Livro removido = pilha.get(pilha.size() - 1);
        pilha.remove(pilha.size() - 1);
        return removido;
    }
    public int count(){
       return pilha.size();
    }

}
