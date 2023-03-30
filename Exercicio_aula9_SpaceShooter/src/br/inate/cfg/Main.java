package br.inate.cfg;

import br.inate.cfg.inimigo.Asteroide;
import br.inate.cfg.jogador.Nave;

public class Main {
    public static void main(String[] args) {
        Nave nv = new Nave("nave1", 100, "Explosivo");
        Nave nv2 = new Nave("nave2", 100, "Normal");
        Asteroide ast1 = new Asteroide("ast1", "Grande");

        nv.atirar(ast1);
        nv2.atirar(ast1);

    }
}
