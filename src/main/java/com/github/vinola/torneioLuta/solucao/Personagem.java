package com.github.vinola.torneioLuta.solucao;

public class Personagem {
    private String name;
    private int forca;
    private int vida;
    private int vitorias;

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

    public void vencerLuta() {
        this.vitorias += 1;
    }

    public void reviver() {
        this.vida = 100;
        System.out.println("Personagem " + this.name + " revivido com vida total!");
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

    public int getVitorias() {
        return vitorias;
    }
}
