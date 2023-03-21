public class Computador {
    String marca;
    float preco;
    MemoriaUSB memoriaUSB;
    HardwareBasico[] hardware = new HardwareBasico[3]; // Array que contem os principais tipos de hardware. [0] = Processador, [1] Memoria Ram, [2]Armazenamento
    SistemaOPeracional sistemaOperacional;

    public Computador(String marca, float preco, String so, int tipoSo) {
        this.marca = marca;
        this.preco = preco;
        sistemaOperacional = new SistemaOPeracional(so, tipoSo);
        HardwareBasico cpu = new HardwareBasico();
        HardwareBasico ram = new HardwareBasico();
        HardwareBasico disco = new HardwareBasico();
        hardware[0] = cpu;
        hardware[1] = ram;
        hardware[2] = disco;
    }

    void mostraPCConfigs() {
        System.out.println("==================");
        System.out.println("Marca: " + marca);
        System.out.println("preço: " + preco);
        System.out.println("Sistema operacional: " + sistemaOperacional.nome + " " + sistemaOperacional.tipo + " bytes");
        System.out.println("---Componentes: ---");
        for (int i = 0; i < hardware.length; i++) {
            if (i == 0) { //processador
                System.out.println(hardware[i].nome);
                System.out.println(hardware[i].capacidade + "Ghz");
            } else if (i == 1) { //Ram
                System.out.println(hardware[i].nome);
                System.out.println(hardware[i].capacidade + " Mhz");

            } else { //armazenamento
                System.out.println(hardware[i].nome);
                System.out.println(hardware[i].capacidade + " Gb/s");
            }
        }
        System.out.println("Memoria Usb: ");
        System.out.println(memoriaUSB.nome + " de " + memoriaUSB.capacidade + " Gb");
    }

    void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;

    }
}
