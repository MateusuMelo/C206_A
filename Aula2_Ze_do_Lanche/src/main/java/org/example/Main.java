package org.example;

import java.util.Scanner;

public class Main {

    //Faca um programa que leia o numero de lanches consumidos nas 3 vezes, calcule a soma e media desses lanches.
    public static void main(String[] args) {
        int lanche1;
        int lanche2;
        int lanche3;

        //Pegando valores
        Scanner valoTeclado = new Scanner(System.in);
        System.out.println("Insira a quantidade dos lanches 1");
        lanche1 = valoTeclado.nextInt();

        System.out.println("Insira a quantidade dos lanches 2");
        lanche2 = valoTeclado.nextInt();

        System.out.println("Insira a quantidade dos lanches 2");
        lanche3 = valoTeclado.nextInt();

        int total_lanches = lanche1+lanche2+lanche3;
        System.out.println("O Total de lanches: " + total_lanches);

        System.out.println("A media de lanches: "+(total_lanches/3));

        valoTeclado.close();


    }
}