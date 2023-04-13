import Mamifero.Boi;
import Mamifero.Cachorro;
import Mamifero.Lontra;

public class Main {
    public static void main(String[] args) {
        Boi boi = new Boi("Bolsogado",100);
        Cachorro dog = new Cachorro("Monte", 50);
        Lontra lont = new Lontra("Perry", 30);

        System.out.println("Informacoes");

        boi.emitirSom();
        dog.emitirSom();
        lont.emitirSom();

        lont.nadar();
    }
}
