import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de Listas";
        String aula2 = "Modelando classes OO";
        String aula3 = "Um pouco de JavaEE";
        String aula4 = "Um pouco de spring";

        ArrayList<String> aulas = new ArrayList<>();

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);

        // System.out.println(aulas.toString());

        // aulas.remove(0);

        // for (String aula : aulas) {
        // System.out.println("Aula: " + aula);
        // }

        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        Collections.sort(aulas);

        System.out.println("Depois de ordenada:  " + aulas.toString());

    }

}