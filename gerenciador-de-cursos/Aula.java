public class Aula implements Comparable<Aula> {

    private String titulo;
    private Integer tempo;

    public Aula(String titulo, Integer tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the tempo
     */
    public Integer getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.tempo.compareTo(outraAula.tempo);
    }
}