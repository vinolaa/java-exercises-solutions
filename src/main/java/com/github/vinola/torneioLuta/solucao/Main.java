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