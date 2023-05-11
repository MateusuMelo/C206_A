import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.nio.file.Files;

import static java.nio.file.Files.readAllLines;

public class Main {
    public static void main(String[] args) {

        try {
            List<String> arquivo = Files.readAllLines(Path.of("C:\\Users\\MateusMelo\\OneDrive - Instituto Nacional de Telecomunicações\\Documents\\POO\\C206_A\\Aula15_Leitura_escrita_arquivos\\src\\main\\java\\professores_disciplina.txt"));
            HashMap<String,String> conteudo = new HashMap<>();
            for (int i = 0; i < arquivo.size(); i++) {
                String [] linha_quebrada = arquivo.get(i).split("=");
                conteudo.put(linha_quebrada[0],linha_quebrada[1]);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
