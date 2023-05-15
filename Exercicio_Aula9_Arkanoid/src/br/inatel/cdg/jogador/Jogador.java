package br.inatel.cdg.jogador;

public class Jogador {
    public static int conversor_ponto(int pontuacao){
        return pontuacao*100;
    }

    private int pontuacao = 0;

    public int getPontuacao() {
        return this.pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

}
