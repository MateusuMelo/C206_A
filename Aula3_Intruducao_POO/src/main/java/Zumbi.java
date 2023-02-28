public class Zumbi {
    double vida = 50;
    boolean fome = true;

    void morder() {
        System.out.println("Morde, F.");
        if (vida < 100) {
            vida += 10;
        } else {
            System.out.println("Zumbi sem fome");
            fome = false;
        }
        System.out.println("Vida do zumbi:" + vida);
    }

    void tomaPaulada() {
        System.out.println("BONK");
        if (vida > 0) {
            vida -= 50;
            System.out.println("Vida do zumbi:" + vida);
        } else System.out.println("Zumbi foi de ralo");

    }

}
