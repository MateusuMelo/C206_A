import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {
    public static void main(String[] args) {
        //exercicio 2

        Random rand = new Random();
        int x = rand.nextInt(2);
        int y = rand.nextInt(2);

        Scanner entrada = new Scanner(System.in);

        int[][] campo = new int[2][2];

        //preenchendo campo com bombas
        campo[x][y] = 1;


        System.out.println("cordenada da bomba: "+x +" e "+y);
        boolean flag = true;
        do {
            System.out.println("Insira cordenadas X do campo:");
            int entradax = entrada.nextInt();
            System.out.println("Insira cordenadas y do campo:");
            int entraday = entrada.nextInt();

            if (campo[entradax][entraday] == 1){
                System.out.println("Voce pisou em uma bomba, tente novamente");
            } else
                flag = false;

        } while (flag == true);
    }
}
