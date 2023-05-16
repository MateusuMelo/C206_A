public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GooglePlus!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo do GooglePlus!");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Começou um streaming no GooglePlus!");
    }
}
