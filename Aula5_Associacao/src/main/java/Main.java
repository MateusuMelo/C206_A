import javax.annotation.processing.ProcessingEnvironment;

public class Main {
    public static void main(String[] args) {
        //Agregação
        //exercicio 5 - Jogo
        /*
        Personagem joao = new Personagem();
        joao.pontos = 100;
        joao.nome = "Joao";

        Arma arma_joao = new Arma();
        arma_joao.nome = "exalibur";
        arma_joao.poder = 100;
        arma_joao.resistencia = 100;
        arma_joao.descricao = "Espada boladissima";

        joao.arma1 = arma_joao;

        System.out.println("Vida do personagem: " + joao.pontos);
        joao.tomarDano();
        System.out.println("Vida do personagem: " + joao.pontos);


        System.out.println("informacao da arma: ");
        arma_joao.mostraInfo();

        joao.usaArma();
        arma_joao.mostraInfo();
        */

        //composição
        //exercicio 6 - mario kart

        Kart kart1 = new Kart("50cc",150);
        Piloto mario = new Piloto("Mario",false);

        kart1.p1 = mario;

        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.pular();

        mario.soltaSuperPoder();

        kart1.motor.mostraInfo();

    }
}
