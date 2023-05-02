import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int cemMil = 100000;
        ArrayList<Integer>array = new ArrayList();

        long Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
            array.add(i);
        }
        long Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para inserir Array :" + ( Tempo_f -Tempo_i) + "\n");




        HashSet<Integer> hSet = new HashSet<>();

        Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
            hSet.add(i);
        }
        Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para inserir HashSet :" + ( Tempo_f -Tempo_i) + "\n");

        HashMap hMap = new HashMap<>();


        Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
           hMap.put(i,i);
        }
        Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para inserir HashMap :" + ( Tempo_f -Tempo_i) + "\n");


        //tempo gasto para Leitura

        Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
            array.contains(i);

        }
        Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para ler ArrayList :" + ( Tempo_f -Tempo_i) + "\n");


        Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
            hSet.contains(i);
        }
        Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para ler HashSet :" + ( Tempo_f -Tempo_i) + "\n");


        Tempo_i = System.currentTimeMillis();
        for (int i = 0; i <= cemMil; i++){
            hMap.containsKey(i);
        }
        Tempo_f = System.currentTimeMillis();
        System.out.println("Tempo gasto para ler HashMap :" + ( Tempo_f -Tempo_i) + "\n");
    }

}
