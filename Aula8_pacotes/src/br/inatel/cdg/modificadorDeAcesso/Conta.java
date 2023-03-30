package br.inatel.cdg.modificadorDeAcesso;

public class Conta {
    private String nome;
    private float saldo;
    public static int id;

    public Conta(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
        id++;
    }

}
