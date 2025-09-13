public class Canais implements Comparable<Canais> {
    private String nome;

    public Canais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Canais outro) {
        return this.nome.compareToIgnoreCase(outro.nome);
    }

    @Override
    public String toString() {
        return nome;
    }
}
javac *.java