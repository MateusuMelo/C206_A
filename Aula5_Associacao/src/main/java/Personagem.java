public class Personagem {
    String nome;
    int pontos;

    Arma arma1;
    void usaArma(){
        System.out.println("Sua arma perdeu 2 de resistencia");
        arma1.resistencia -= 2;
    }

    void tomarDano(){
        System.out.println("Tomou Dano");
        pontos -=5;
    }

}
