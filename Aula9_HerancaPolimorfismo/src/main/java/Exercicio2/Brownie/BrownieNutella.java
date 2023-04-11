package Exercicio2.Brownie;

public class BrownieNutella extends Brownie {
    int g_nutella;

    public BrownieNutella(String nome, double preco, String sabor, int g_nutella) {
        super(nome, preco, sabor);
        this.g_nutella = g_nutella;
    }

    @Override
    public void addCarrinhoDeCompras() {

        System.out.println("Adicionando carrinho de Café.");
    }
}
