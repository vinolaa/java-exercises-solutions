package com.github.vinola.numerosPrimos;

import java.util.ArrayList;

public class NP {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i < 25; i++){ // MODIFICAR O I < (NUMERO) PARA MEXER NA QTD DE NUMEROS
            numeros.add(i);
        }
        verficarNumeroPrimo(numeros);
    }

    public static void verficarNumeroPrimo(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            boolean isPrimo = true;
            int numAnalise = lista.get(i);
            if (numAnalise <= 1) {
                isPrimo = false;
            }
            for (int j = 2; j < numAnalise - 1; j++) {
                if (numAnalise % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            System.out.println(numAnalise + " " + isPrimo);
        }
    }
}
