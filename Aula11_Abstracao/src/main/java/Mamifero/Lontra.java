package Mamifero;

public class Lontra extends Mamifero implements Interface.Aquatico{
    public Lontra(String nome, double vida) {
        super(nome, vida);
    }
    @Override
    public void emitirSom() {
        System.out.println("somdalontra");
    }

    @Override
    public void nadar() {
        System.out.println("A lontra esta nadando!");
    }
}
