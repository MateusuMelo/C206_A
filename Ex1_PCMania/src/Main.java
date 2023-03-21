import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        Computador pc1 = new Computador("Positivo", 2300.00f, "Linux Ubuntu", 32);
        pc1.hardware[0].nome = "Pentium Core i3";
        pc1.hardware[0].capacidade = 2.20f;
        pc1.hardware[1].nome = "Memoria ram";
        pc1.hardware[1].capacidade = 8;
        pc1.hardware[2].nome = "Armazenamento";
        pc1.hardware[2].capacidade = 500;
        MemoriaUSB memoria16gb = new MemoriaUSB("pendrive",16);
        pc1.addMemoriaUSB(memoria16gb);

        Computador pc2 = new Computador("Acer", 5800.0f, "Windows 8", 64);
        pc2.hardware[0].nome = "Pentium Core i5";
        pc2.hardware[0].capacidade = 3.37f;
        pc2.hardware[1].nome = "Memoria ram";
        pc2.hardware[1].capacidade = 16;
        pc2.hardware[2].nome = "Armazenamento";
        pc2.hardware[2].capacidade = 1000;
        MemoriaUSB memoria32gb = new MemoriaUSB("pendrive",32);
        pc2.addMemoriaUSB(memoria32gb);

        Computador pc3 = new Computador("Vaio", 1800.0f, "Windows 10", 64);
        pc3.hardware[0].nome = "Pentium Core i7";
        pc3.hardware[0].capacidade = 4.5f;
        pc3.hardware[1].nome = "Memoria ram";
        pc3.hardware[1].capacidade = 32;
        pc3.hardware[2].nome = "Armazenamento";
        pc3.hardware[2].capacidade = 2000;
        MemoriaUSB memoria1tb = new MemoriaUSB("Hd externo",1000);
        pc3.addMemoriaUSB(memoria1tb);


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

                case 0:
                    flag_menu = false;
                    entrada.nextLine();
                    break;

                default:
                    System.out.println("Essa não é uma opção valida! Tente algumas das opções citadas.");
            }

        } while (flag_menu);

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
