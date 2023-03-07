public class Kart {
    String nome;

    Motor motor;
    Piloto p1;

    public Kart(String cilindradas, float velMax) {
        motor = new Motor(cilindradas, velMax);
    }

    void pular(){
        System.out.println("JUMP!");
    }
    void soltarTurbo(){
        System.out.println("TURBOOO!");
    }
    void fazerDrift(){
        System.out.println("TOKYO DRIFT");
    }
}
