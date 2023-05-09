package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(5000, 3000);
        c1.clientes.add(new Cliente("jeremias"));

        try {
            c1.sacar(7000);
        }catch (RuntimeException e){
            System.out.println("Erro: " + e);
        }


        }
    }

