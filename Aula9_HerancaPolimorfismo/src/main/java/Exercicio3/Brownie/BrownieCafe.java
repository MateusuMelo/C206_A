package Exercicio3.Brownie;

public class BrownieCafe extends Brownie{
    public BrownieCafe(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }

    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando brownie de cafe no carrinho");
    }
}
