package br.inatel.cdg;

import br.inatel.cdg.bloco.Bloco;
import br.inatel.cdg.jogador.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();

        int random = (int) (Math.random() * (5)) + 1; //Criando vetores com tamanho aleatorio de 0 a 5
        Bloco[] blocos = new Bloco[random];

        for (int i = 0; i< blocos.length;i++){ //Preenchendo o vetor de blocos com objetos blocos.
            blocos[i] = new Bloco();
        }

        random = (int) (Math.random() * (blocos.length)); // reutilizando a variavel para escolher aletoriamente quantos dos blocos criados serão destruidos.
        for (int i = 0; i < random; i++) {
            blocos[i].destruir(j1);
        }
        System.out.println("Foram criados um total de " + blocos.length + " blocos");
        System.out.println("Foram destruidos um total de " + j1.getPontuacao() + " blocos");
        System.out.println("O jogador possui  " + Jogador.conversor_ponto(j1.getPontuacao()) + " moedas");
    }
}
