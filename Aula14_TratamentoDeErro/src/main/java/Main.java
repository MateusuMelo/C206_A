import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(5000, 3000);
        c1.clientes.add(new Cliente("jeremias"));
        c1.clientes.add(new Cliente("Guilherme"));
        c1.clientes.add(null);

        c1.mostraInfo();
        }
    }

