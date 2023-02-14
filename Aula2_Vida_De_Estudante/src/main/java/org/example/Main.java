package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int NPA;
        int NP3;
        int NFA;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota NPA");
        NPA = entrada.nextInt();

        if(NPA >= 60){
            System.out.println("Aprovado");
        }
        else
        {
            System.out.println("insira a nota da np3");
            NP3 = entrada.nextInt();

            NFA = (NPA+NP3) / 2;

            if(NFA >= 50){
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }
        }
        entrada.close();
    }
}