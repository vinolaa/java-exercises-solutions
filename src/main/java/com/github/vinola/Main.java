package com.github.vinola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer antes de ler a string

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Número: " + numero);
        System.out.println("Nome: " + nome);

        scanner.close();
    }
}
