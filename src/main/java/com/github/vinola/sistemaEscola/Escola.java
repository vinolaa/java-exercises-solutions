package com.github.vinola.sistemaEscola;

import java.util.ArrayList;

public class Escola {

    private ArrayList<Aluninho> alunos;

    public Escola() {
        alunos = new ArrayList<>();
    }

    public ArrayList<Aluninho> getAlunos() {
        return alunos;
    }

    public void cadastrarAluno(String nome, int idade) {
        Aluninho novoAluno = new Aluninho(nome, idade);
        alunos.add(novoAluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void listarAlunos() {
        System.out.println("Alunos disponíveis no sistema: ");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(i+1 + "- " + alunos.get(i).getNome());
        }
    }

    public void infosAluno(int id) {
        int index = id-1;
        System.out.println("Aluno " + index);
        System.out.println("Nome: " + alunos.get(index).getNome());
        System.out.println("Idade: " + alunos.get(index).getIdade());
        System.out.println("Notas: " + alunos.get(index).getNotas());
    }
}
