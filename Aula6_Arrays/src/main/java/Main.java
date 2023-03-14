public class Main {
    public static void main(String[] args) {

    Cantina cantina_Inatel = new Cantina();
    Salgado pastel = new Salgado("pastel");
    Salgado pizza = new Salgado("Pizza");
    Salgado carne = new Salgado("Carne");

    cantina_Inatel.addSalgado(pastel);
    cantina_Inatel.addSalgado(pizza);
    cantina_Inatel.addSalgado(carne);

    cantina_Inatel.mostraInfo();
    }
}
