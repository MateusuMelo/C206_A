import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<RedeSocial> redes = new ArrayList<RedeSocial>();
        redes.add(new Twitter("123654789", 500));
        redes.add(new Instagram("123654789", 1300));
        redes.get(0).postarComentario();

        Usuario user = new Usuario("Jeremias", "JeremiasBoladao@yahoo.com.br", redes);

        try {
            //Executando metodos
            for (int i = 0; i < user.RedesSociais.size(); i++) {
                if (user.RedesSociais.get(i) instanceof Twitter) {
                    Twitter tt = (Twitter) user.RedesSociais.get(i);
                    tt.compartilhar();
                    tt.postarComentario();
                    tt.curtirPublicacao();
                } else if (user.RedesSociais.get(i) instanceof Facebook) {
                    Facebook fb = (Facebook) user.RedesSociais.get(i);
                    fb.fazStreaming();
                    fb.postarVideo();
                    fb.postarFoto();
                } else if (user.RedesSociais.get(i) instanceof Instagram) {
                    Instagram ig = (Instagram) user.RedesSociais.get(i);
                    ig.curtirPublicacao();
                    ig.postarComentario();
                    ig.postarVideo();
                } else {
                    GooglePlus gp = (GooglePlus) user.RedesSociais.get(i);
                    gp.fazStreaming();
                    gp.compartilhar();
                    gp.postarFoto();
                }
            }
        } catch (Exception e) {
            System.out.println("Erro");
            e.printStackTrace();
        }

    }
}
