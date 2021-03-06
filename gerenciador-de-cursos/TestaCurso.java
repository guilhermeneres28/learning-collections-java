import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso curso = new Curso("Java Collections", "Paulo Silveira");

        List<Aula> aulas = curso.getAulas();

        System.out.println("Aulas do curso logo apos a instancia: " + aulas);

        curso.adiciona(new Aula("Revisando ArrayList", 15));
        curso.adiciona(new Aula("Entendendo a interface Comparable", 20));
        curso.adiciona(new Aula("Implementando o metodo compareTo para permitir ordenacao", 25));

        System.out.println("Aulas do curso logo apos adicionar aulas na lista: " + aulas);
    }
}