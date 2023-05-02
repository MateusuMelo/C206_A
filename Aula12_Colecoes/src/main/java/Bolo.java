public abstract class Bolo implements Comparable<Integer> {
    String nome;
    int id;

    public Bolo(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }
    @Override
    public int compareTo(Object o) {
        if (this.id < 0.id){
            return 1;
        } else if (this.id > o.id) {
            return -1;
        }
        return 0;
    }
}
