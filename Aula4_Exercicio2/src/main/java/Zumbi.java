public class Zumbi {
    double vida;
    String nome;

    boolean transfere;

    double MostraVida() {
        System.out.println(vida);
        return 0;
    }

    boolean TransfereVida(Zumbi zumbiAlvo, double quantia) {

        if (quantia <= vida) {
            zumbiAlvo.vida += quantia;
            vida -= quantia;
            System.out.println("A transferencia foi realizada");

            return true;

        } else {
            System.out.println("A transferencia nao foi realizada");

            return false;
        }
    }
}

