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
        for (Salgado salgado : salgado1) {
            if (salgado != null) {
                System.out.println("Salgado de " + salgado.nome);
            }
        }
    }
}
