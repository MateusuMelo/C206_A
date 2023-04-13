package Mamifero;

public abstract class Mamifero {
    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }
    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    void mostraInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
    }

    public abstract void emitirSom();
}
