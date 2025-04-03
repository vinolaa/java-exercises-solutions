package com.github.vinola.sistemaBiblioteca.solucao;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void pegarEmprestado(Livro livro) {
        this.livrosEmprestados.add(livro);
        livro.emprestar();
        System.out.println("Livro emprestado com sucesso.");
    }

    public void devolverLivro(Livro livro) {
        this.livrosEmprestados.remove(livro);
        livro.devolver();
        System.out.println("Livro devolvido com sucesso.");
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados: " + this.livrosEmprestados);
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }
}
