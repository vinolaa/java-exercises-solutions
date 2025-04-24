package com.github.vinola.piramide;

public class Piramide {
    public static void main(String[] args) {
        desenharTrinagulo(5);
    }

    public static void desenharTrinagulo(int altura) {
        for (int i = 0; i < altura-1; i++) {
            System.out.println(" ".repeat(altura - (i + 1)) + "/" + " ".repeat(i * 2) + "\\");
        }
        System.out.println("/" + "_".repeat((altura-1) * 2) + "\\");
    }
}
