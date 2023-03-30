package br.inate.cfg.inimigo;

public class Asteroide {
    private String name;
    private String tipoAsteroide;

    public Asteroide(String nome, String tipoAsteroide){
        this.name = nome;
        this.tipoAsteroide = tipoAsteroide;
    }
    public void destruir(){
        System.out.println(this.name +" Asteroide destruido");
    }

    public String getName() {
        return name;
    }

    public String getTipoAsteroide() {
        return tipoAsteroide;
    }
}

