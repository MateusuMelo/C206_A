import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Bolo> listBolo = new ArrayList<>();

        listBolo.add(new BoloDeBufa("Bolo de bufa",0));
        listBolo.add(new BoloDeBufa("Bolo de bufa com chacolate",1));
        listBolo.add(new BoloDeChacolate("Bolo de chacolate",2));
        listBolo.add(new BoloDeChacolate("Bolo de chacolate derretido",3));
        listBolo.add(new BoloDeFroquis("Bolo de Froquis",4));
        listBolo.add(new BoloDeFroquis("Bolo de Froqis com coca",5));


    }
}
