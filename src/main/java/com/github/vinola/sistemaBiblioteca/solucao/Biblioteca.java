package com.github.vinola.sistemaBiblioteca.solucao;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (this.livros.contains(livro)) {
            System.out.println("Este livro já existe.");
            return;
        }
        this.livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        if (this.usuarios.contains(usuario)) {
            System.out.println("Este usuário já existe.");
            return;
        }
        this.usuarios.add(usuario);
    }

    public void emprestarLivro(String titulo, Usuario usuario) {
        if (!this.usuarios.contains(usuario)) {
            System.out.println("Usuario não cadastrado.");
        }
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("Livro emprestado.");
                    usuario.pegarEmprestado(livro);
                } else {
                    System.out.println("Livro não disponível.");
                }
                return;
            }
            System.out.println("Livro não encontrado.");
        }
    }

    public void devolverLivro(String titulo, Usuario usuario) {
        if (!this.usuarios.contains(usuario)) {
            System.out.println("Usuario não cadastrado.");
            return;
        }
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(titulo)) {
                if (!livro.isDisponivel()) {
                    if (usuario.getLivrosEmprestados().contains(livro)) {
                        usuario.devolverLivro(livro);
                    } else {
                        System.out.println("Este livro não está emprestado por este usuário.");
                    }
                } else {
                    System.out.println("Livro já está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : this.livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

}
