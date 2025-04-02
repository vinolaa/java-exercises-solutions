package com.github.vinola.sistemaEscola;

import java.util.ArrayList;

public class Aluninho {
    private String nome;
    private int idade;
    private ArrayList<Double> notas;

    public Aluninho(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.notas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void cadastrarNotas(ArrayList<Double> notas) {
        for (int i = 0; i < notas.size(); i++) {
            this.notas.add(notas.get(i));
        }
        System.out.println("Notas cadastradas com sucesso!");
    }

    public Double calcularMedia(ArrayList<Double> notas) {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double media = 0;
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }
        media = media / notas.size();
        return media;
    }
}
