import java.util.LinkedList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    // Inicializacao da lista de aulas
    private List<Aula> aulas = new LinkedList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the instrutor
     */
    public String getInstrutor() {
        return instrutor;
    }

    /**
     * @return the aulas
     */
    public List<Aula> getAulas() {
        return aulas;
    }
}