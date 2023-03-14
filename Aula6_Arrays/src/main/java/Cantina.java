public class Cantina {
    Salgado[] salgado1 = new Salgado[3];

    void addSalgado(Salgado novoSalgado) {
        for (int i = 0; i < salgado1.length; i++) {
            if (salgado1[i] == null) {
                salgado1[i] = novoSalgado;
                break;
            }
        }
    }

    void mostraInfo(){
        for (int i = 0; i<salgado1.length;i++) {
            if (salgado1[i] != null){
                System.out.println("Salgado de " + salgado1[i].nome);
            }
        }
    }
}
