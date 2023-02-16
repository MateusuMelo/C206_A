package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Alunos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o numero de alunos:");

        switch (Alunos = entrada.nextInt()) {
            case 10:
                System.out.println("Sala I-16");
                break;
            case 20:
                System.out.println("Sala I-16");
                break;
            case 30:
                System.out.println("Sala I-22");
                break;
            default:
                System.out.println("Erro!");
        }
        entrada.close();
    }
}