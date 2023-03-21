public class Cliente {
    String nome;
    long cpf;
    Computador[] compras = new Computador[5]; // Carrinho do cliente

    float calculaTOtalCompra(){
        float total = 0;
        for(int i = 0;i< compras.length;i++){
            if (compras[i] != null){
                total += compras[i].preco;
            }
        }
        return total;
    }
}
