package com.github.vinola.sistemaEscola;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSistemaEscola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Escola escola = new Escola();

        boolean rodando = true;

        while (rodando) {
            System.out.println("----- MENU -----");
            System.out.println("1- Cadastrar novo aluno");
            System.out.println("2- Cadastrar notas do aluno");
            System.out.println("3- Exibir informações de um aluno");
            System.out.println("4- Exibir média de um aluno");
            System.out.println("5- Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrar novo aluno");
                    System.out.println("> Digite o nome do aluno: ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    System.out.println("> Digite a idade do aluno: ");
                    int idade = scanner.nextInt();
                    escola.cadastrarAluno(nome, idade);
                    break;
                case 2:
                    System.out.println("-- CADASTRO DE NOTAS --");
                    if (escola.getAlunos().isEmpty()) {
                        System.out.println("Sem alunos cadastrados.");
                        break;
                    }
                    escola.listarAlunos();
                    System.out.println("Qual aluno voce deseja verificar? ");
                    int alunoNota = scanner.nextInt();
                    System.out.println("Quantas notas deseja cadastrar? ");
                    int numNotas = scanner.nextInt();
                    ArrayList<Double> notas = new ArrayList<>();
                    for (int i = 0; i < numNotas; i++) {
                        Double nota = scanner.nextDouble();
                        notas.add(nota);
                    }
                    escola.getAlunos().get(alunoNota-1).cadastrarNotas(notas);
                    break;
                case 3:
                    if (escola.getAlunos().isEmpty()) {
                        System.out.println("Sem alunos cadastrados.");
                        break;
                    }
                    escola.listarAlunos();
                    System.out.println("Qual aluno voce deseja verificar? ");
                    int alunoVerificado = scanner.nextInt();
                    escola.infosAluno(alunoVerificado);
                    break;
                case 4:
                    if (escola.getAlunos().isEmpty()) {
                        System.out.println("Sem alunos cadastrados. Digite 0 para voltar. ");
                        break;
                    }
                    escola.listarAlunos();
                    System.out.println("Qual aluno voce deseja verificar? ");
                    int alunoMedia = scanner.nextInt();
                    Aluninho aluno = escola.getAlunos().get(alunoMedia -1);
                    Double media = aluno.calcularMedia(aluno.getNotas());
                    System.out.println(media);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        }
        System.out.println("Você saiu do programa!");
    }
}
