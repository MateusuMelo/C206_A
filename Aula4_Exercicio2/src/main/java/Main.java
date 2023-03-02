public class Main {
    public static void main(String[] args) {
        Zumbi cris = new Zumbi();
        Zumbi ana = new Zumbi();

        cris.vida = 100;
        ana.vida = 50;

        ana.TransfereVida(cris,60);
        ana.MostraVida();

        ana.TransfereVida(cris,50);
        ana.MostraVida();
    }
}
