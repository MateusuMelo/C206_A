import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        //Computadores gerados aleatoriamente usando chatgpt

        Computador pc1 = new Computador("Dell", 3999.5f, "Windows 10", 64);
        pc1.hardware[0].nome = "Intel Core i7-10700";
        pc1.hardware[0].capacidade = 2.90f;
        pc1.hardware[1].nome = "Memoria ram";
        pc1.hardware[1].capacidade = 16;
        pc1.hardware[2].nome = "Armazenamento";
        pc1.hardware[2].capacidade = 1000;

        Computador pc2 = new Computador("Lenovo", 3499.00f, "Windows 10", 64);
        pc2.hardware[0].nome = "AMD Ryzen 5 4600H";
        pc2.hardware[0].capacidade = 3.00f;
        pc2.hardware[1].nome = "Memoria ram";
        pc2.hardware[1].capacidade = 8;
        pc2.hardware[2].nome = "Armazenamento";
        pc2.hardware[2].capacidade = 512;

        Computador pc3 = new Computador("HP", 4299.00f, "Windows 11", 64);
        pc3.hardware[0].nome = "Intel Core i5-11600K";
        pc3.hardware[0].capacidade = 3.90f;
        pc3.hardware[1].nome = "Memoria ram";
        pc3.hardware[1].capacidade = 16;
        pc3.hardware[2].nome = "Armazenamento";
        pc3.hardware[2].capacidade = 512;

        Computador pc4 = new Computador("Asus", 5899.00f, "Windows 10", 64);
        pc4.hardware[0].nome = "Intel Core i9-11900K";
        pc4.hardware[0].capacidade = 3.50f;
        pc4.hardware[1].nome = "Memoria ram";
        pc4.hardware[1].capacidade = 32;
        pc4.hardware[2].nome = "Armazenamento";
        pc4.hardware[2].capacidade = 1000;

        Computador pc5 = new Computador("Apple", 12999.00f, "macOS Big Sur", 64);
        pc5.hardware[0].nome = "Apple M1";
        pc5.hardware[0].capacidade = 3.20f;
        pc5.hardware[1].nome = "Memoria ram";
        pc5.hardware[1].capacidade = 16;
        pc5.hardware[2].nome = "Armazenamento";
        pc5.hardware[2].capacidade = 256;


        boolean flag_menu = true; // flag de looping do menu de opções

        System.out.println("Bem-vindo ao PCMania" + "\n");
        System.out.println("Computadores á venda" + "\n");
        System.out.println("promoção 1:");
        pc1.mostraPCConfigs();
        System.out.println("\n");
        System.out.println("promoção 2:");
        pc2.mostraPCConfigs();
        System.out.println("\n");
        System.out.println("promoção 3:");
        pc3.mostraPCConfigs();
        System.out.println("\n");
        System.out.println("promoção 4:");
        pc4.mostraPCConfigs();
        System.out.println("\n");
        System.out.println("promoção 5:");
        pc5.mostraPCConfigs();
        System.out.println("\n");

        System.out.println("\\----------------Qual desja comprar ? Digite o numero da promoção ou envie '0' para sair. ----------------/" + "\n");

        Scanner entrada = new Scanner(System.in); // declarando fora do escopo do while, para economizar classes Scanner
        int carrinho = 0; //quantos itens no carrinho
        do {

            switch (entrada.nextInt()) {
                case 1:
                    cliente.compras[carrinho] = pc1;
                    carrinho += 1;
                    System.out.println("Compra adicionada ao carrinho!");
                    break;
                case 2:
                    cliente.compras[carrinho] = pc2;
                    carrinho += 1;
                    System.out.println("Compra adicionada ao carrinho!");
                    break;
                case 3:
                    cliente.compras[carrinho] = pc3;
                    carrinho += 1;
                    System.out.println("Compra adicionada ao carrinho!");
                    break;
                case 4:
                    cliente.compras[carrinho] = pc4;
                    carrinho += 1;
                    System.out.println("Compra adicionada ao carrinho!");
                    break;

                case 5:
                    cliente.compras[carrinho] = pc5;
                    carrinho += 1;
                    System.out.println("Compra adicionada ao carrinho!");
                    break;

                case 0:
                    flag_menu = false;
                    entrada.nextLine();
                    break;

                default:
                    System.out.println("Essa não é uma opção valida! Tente algumas das opções citadas.");
            }

        } while (flag_menu == true);

        System.out.println("Faça seu cadastro para finalizar a compra."); //Decidi realizar o cadastro no fim da compra como em muitos sites.
        System.out.println("Entre com seu Nome e em seguida o cpf(somente numeros) respectivamente:" + "\n");
        cliente.nome = entrada.nextLine();
        cliente.cpf = entrada.nextLong();
        entrada.close();

        System.out.println("Compra realizada, obrigado por comprar com a PCMania, sr(a) " + cliente.nome);

        System.out.println("-----------Gerando nota...---------");
        System.out.println("Cliente: " + cliente.nome);
        System.out.println("CPF: " + cliente.cpf);
        System.out.println("Total da compra: " + cliente.calculaTOtalCompra());


    }
}
