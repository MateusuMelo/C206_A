import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    public ArrayList<RedeSocial> RedesSociais = new ArrayList<>();

    public Usuario(String nome, String email, ArrayList<RedeSocial> redesSociais) {
        this.nome = nome;
        this.email = email;
        this.RedesSociais = redesSociais;
    }
}
