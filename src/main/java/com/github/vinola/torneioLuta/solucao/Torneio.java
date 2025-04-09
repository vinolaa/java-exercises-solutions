package com.github.vinola.torneioLuta.solucao;

import java.util.ArrayList;

public class Torneio {
    private ArrayList<Personagem> personagens;

    public Torneio() {
        this.personagens = new ArrayList<>();
    }

    public void cadastrarPersonagem(String nome, int forca) {
        Personagem newPersonagem = new Personagem(nome, forca);
        this.personagens.add(newPersonagem);
        System.out.println("Personagem " + nome + " cadastrado com força " + forca);
    }

    public void listarPersonagens() {
        if (this.personagens.isEmpty()) {
            System.out.println("=-=-=-=-=- SEM PERSONAGENS CADASTRADOS -=-=-=-=");
        }

        System.out.println("=-=-=-=-=- PERSONAGENS CADASTRADOS PARA O TORNEIO -=-=-=-=");
        for (Personagem personagem : personagens) {
            System.out.println("PERSONAGEM NUMERO " + (personagens.indexOf(personagem) + 1));
            System.out.println("Nome: " + personagem.getName());
            System.out.println("Forca: " + personagem.getForca());
            System.out.println("Vida: " + personagem.getVida());
            System.out.println("-------------------------------------------------");
        }
    }

    public void simularLuta(Personagem p1, Personagem p2) {
        boolean vencedor = false;

        Personagem atacante = p1;
        Personagem defensor = p2;

        while (!vencedor) {                          //atacante -> p1   defensor -> p2
            atacante.atacar(defensor);               //atacante ataca o defensor, logo, p1 ataca p2 (p2 perde vida)
            if (defensor.estaVivo()) {               //verificar se o defensor possui vida > que 0 ou morreu com o ataque do atacante
                Personagem aux = atacante;           //aux (Personagem) -> atacante; atacante = defensor; defensor = atacante;
                atacante = defensor;
                defensor = aux;
            } else {
                vencedor = true;
                System.out.println("Personagem vencedor: " +
                        atacante.getName() +
                        " -> Vida restante: "
                        + atacante.getVida());
            }
        }
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }
}
