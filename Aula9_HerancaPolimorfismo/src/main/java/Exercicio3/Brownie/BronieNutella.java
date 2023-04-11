package Exercicio3.Brownie;

public class BronieNutella extends Brownie{
    public BronieNutella(String nome, String sabor, double preco) {
        super(nome, sabor, preco);
    }
    @Override
    public void addCarrinhoDeCompra() {
        System.out.println("Adicionando brownie de nutela no carrinho");
    }
}
