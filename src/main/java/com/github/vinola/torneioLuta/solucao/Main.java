package com.github.vinola.torneioLuta.solucao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Torneio torneio = new Torneio();

        boolean rodando = true;

        while (rodando) {
            System.out.println("-=- BEM VINDO AO MENU DE TORNEIO -=-");
            System.out.println("1- Cadastrar personagem");
            System.out.println("2- Listar personagens");
            System.out.println("3- Simular luta");
            System.out.println("4- Exibir rank de vitórias");
            System.out.println("5- Reviver personagens mortos");
            System.out.println("6- Mata-Mata");
            System.out.println("0 - Sair");
            int op = s.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Informe o nome do personagem: ");
                    s.nextLine();
                    String nome = s.nextLine();
                    System.out.println("Informe o forca do personagem: ");
                    int forca = s.nextInt();
                    torneio.cadastrarPersonagem(nome, forca);
                    break;
                case 2:
                    torneio.listarPersonagens();
                    break;
                case 3:
                    if (torneio.getPersonagens().size() < 2) {
                        System.out.println("O TORNEIO PRECISA DE NO MINIMO 2 PERSONAGENS CADASTRADOS!");
                        break;
                    }
                    torneio.listarPersonagens();
                    System.out.println("ESCOLHA OS PERSONAGENS DA LUTA, RESPECTIVAMENTES P1 E P2: ");
                    int p1 = s.nextInt();
                    int p2 = s.nextInt();
                    torneio.simularLuta(
                            torneio.getPersonagens().get(p1-1),
                            torneio.getPersonagens().get(p2-1)
                    );
                    break;
                case 4:
                    torneio.exibirRankVitorias();
                    break;
                case 5:
                    if (torneio.getPersonagens().isEmpty()) {
                        System.out.println("=-=-=-=-=- SEM PERSONAGENS CADASTRADOS -=-=-=-=");
                        break;
                    }

                    if (torneio.getPersonagens().stream().allMatch(Personagem::estaVivo)) {
                        System.out.println("Nenhum personagem morto.");
                        break;
                    }

                    torneio.exibirPersonagensMortos();
                    System.out.println("ESCOLHA O PERSONAGEM QUE DESEJA REVIVER: ");
                    int reviver = s.nextInt();
                    Personagem personagemReviver = torneio.getPersonagens().get(reviver-1);
                    torneio.reviverPersonagem(personagemReviver);
                    break;
                case 6:
                    torneio.iniciarTorneioAutomatico();
                    break;
                case 0:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        }

    }
}