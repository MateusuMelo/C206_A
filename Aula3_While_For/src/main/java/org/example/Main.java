package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int chute;

        Random rand = new Random();
        num = rand.nextInt(10) + 1;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Insira um numero");
            chute = entrada.nextInt();
            if (chute < num) {
                System.out.println("Errou, o numero é maior que este.");
            } else if(chute > num)
                System.out.println("Errou, o numero é menor que este.");
        } while (chute != num);

        System.out.println("Voce acertou");
        entrada.close();
    }
}