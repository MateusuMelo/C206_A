package Exercicio1.Brownie;

public class BrownieCafe extends Brownie {
    int g_cafe;
    public BrownieCafe(String nome, double preco, String sabor, int g_cafe) {
        super(nome, preco, sabor);
        this.g_cafe = g_cafe;
    }
}
