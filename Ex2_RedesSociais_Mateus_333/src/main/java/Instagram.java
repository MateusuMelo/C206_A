public class Instagram extends RedeSocial implements Compartilhamento{
    public Instagram(String senha, int numAmigos) {
        super(senha, numAmigos);
    }
    @Override
    public void curtirPublicacao(){
        System.out.println("no Instagram");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Instagram!");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no Instagram!");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Instagram!");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo do Instagram!");
    }
}
