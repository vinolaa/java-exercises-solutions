package com.github.vinola.torneioLuta.solucao;

public class Personagem {
    private String name;
    private int forca;
    private int vida;

    public Personagem(String name, int forca) {
        this.name = name;
        this.forca = forca;
        this.vida = 100;
    }

    public Personagem() {
        this.name = "Desconhecido";
        this.forca = 10;
        this.vida = 100;
    }

    public void atacar(Personagem oponente) {
        oponente.receberDano(this.forca);
    }

    public void receberDano(int dano) {
        this.vida -= dano;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getName() {
        return name;
    }

    public int getForca() {
        return forca;
    }

    public int getVida() {
        return vida;
    }
}
