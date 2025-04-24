package com.github.vinola.torneioLuta.solucao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
                atacante.vencerLuta();
                System.out.println("Personagem vencedor: " +
                        atacante.getName() +
                        " -> Vida restante: "
                        + atacante.getVida() +
                        " -> Vitórioas: "
                        + atacante.getVitorias()
                );
            }
        }
    }

    public void exibirRankVitorias() {
        System.out.println("=-=-=-=-=- RANK DE VITORIAS -=-=-=-=");
        List<Personagem> personagensComVitorias = personagens.stream()
                .filter(personagem -> personagem.getVitorias() > 0)
                .sorted((p1, p2) -> Integer.compare(p2.getVitorias(), p1.getVitorias()))
                .toList();

        if (this.personagens.isEmpty()) {
            System.out.println("Nenhum personagem cadastrado.");
            return;
        }

        if (personagensComVitorias.isEmpty()) {
            System.out.println("Nenhum personagem com pelo menos 1 vitória.");
            return;
        }

        for (Personagem personagem : personagensComVitorias) {
            System.out.println("Nome: " + personagem.getName() + " - Vitorias: " + personagem.getVitorias());
        }
    }

    public void exibirPersonagensMortos() {
                System.out.println("=-=-=-=-=- PERSONAGENS MORTOS -=-=-=-=");
        for (Personagem personagem : personagens) {
            if (personagem.estaVivo()) {
                continue;
            }
            System.out.println("PERSONAGEM NUMERO " + (personagens.indexOf(personagem) + 1));
            System.out.println("Nome: " + personagem.getName());
            System.out.println("-------------------------------------------------");
        }
    }

    public void reviverPersonagem(Personagem personagem) {
        personagem.reviver();
    }

    public void iniciarTorneioAutomatico() {
        if (personagens.size() < 2) {
            System.out.println("O torneio precisa de pelo menos 2 personagens para começar!");
            return;
        }

        System.out.println("=-=-=-=-=- INICIANDO TORNEIO AUTOMÁTICO -=-=-=-=");

        while (personagens.size() > 1) {
            Collections.shuffle(personagens);

            Personagem p1 = personagens.get(0);
            Personagem p2 = personagens.get(1);

            System.out.println("Luta entre: " + p1.getName() + " vs " + p2.getName());
            simularLuta(p1, p2);

            if (!p1.estaVivo()) {
                personagens.remove(p1);
            } else {
                personagens.remove(p2);
            }
        }

        Personagem campeao = personagens.get(0);
        System.out.println("=-=-=-=-=- CAMPEÃO DO TORNEIO -=-=-=-=");
        System.out.println("Nome: " + campeao.getName());
        System.out.println("Vitórias: " + campeao.getVitorias());
    }

    public ArrayList<Personagem> getPersonagens() {
        return personagens;
    }
}
