package Exercicio2;

import java.util.HashSet;

public class Conta {
    double saldo;
    double limite;
    HashSet<Cliente>clientes = new HashSet<>();

    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    void sacar(double saldo){
        if (saldo <= this.saldo){
            this.saldo -= saldo;
            System.out.println("Sacando: " + saldo);
        }else
            throw new SaldoInsuficienteException("Operação cancelada: saldo insuficiente");
    }
    void mostraInfo(){
        System.out.println("Clientes : ");
        for (int i = 0;i<clientes.size();i++){
            try {
                clientes.contains(i);

            }catch (NullPointerException err){
                System.out.println("Erro: " + err);
            }
        }
        System.out.println("saldo: " + saldo);
        System.out.println("limite: " + limite);

    }
}
