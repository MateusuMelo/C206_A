package br.inatel.cdg.bloco;

import br.inatel.cdg.jogador.Jogador;

public class Bloco {
    private static int nBlocos;

    public Bloco() {
        nBlocos++;
    }


    public void destruir(Jogador player) {
        nBlocos--;
        System.out.println("Bloco destruido");
        player.setPontuacao(1);
    }

    public static int getnBlocos() {
        return nBlocos;
    }
}
