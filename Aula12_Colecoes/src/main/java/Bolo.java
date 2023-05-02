public abstract class Bolo implements Comparable<Bolo> {
    String nome;
    int id;

    public Bolo(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    @Override
    public int compareTo(Bolo o) {
        return  Integer.compare(o.id, this.id);
    }
}
