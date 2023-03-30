package br.inate.cfg.jogador;

import br.inate.cfg.inimigo.Asteroide;

public class Nave {
    private String nome;
    private double vida;
    private String tipoTiro;

    public Nave(String nome, double vida, String tipoTiro){
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }
   public void atirar(Asteroide ast){
        System.out.println(this.nome +" Atirou no asteroide");
        if (ast.getTipoAsteroide().equals("Grande")&& tipoTiro.equals("Normal")){
            System.out.println("Munição da nave "+ this.nome +  " não destruiu o asteroide");
        } else{
            ast.destruir();
        }
    }
}
