import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteDiferencaListas {
    public static void main(String[] args) {

        System.out.println("**** ArrayList vs LinkedList ***");

        List<Integer> elementosArrayList = new ArrayList<>();
        List<Integer> elementosLinkedList = new LinkedList<>();

        Integer quantidadeElementos = 1000000;

        long tempoArrayList = insereElementosNo(elementosArrayList, quantidadeElementos);
        long tempoLinkedList = insereElementosNo(elementosLinkedList, quantidadeElementos);

        System.out.println("Inserção na ArrayList demorou  " + tempoArrayList);
        System.out.println("Inserção na LinkedList demorou " + tempoLinkedList);

        tempoArrayList = removePrimeirosElementos(elementosArrayList);
        tempoLinkedList = removePrimeirosElementos(elementosLinkedList);

        System.out.println("Remoção da ArrayList demorou  " + tempoArrayList);
        System.out.println("Remoção da LinkedList demorou " + tempoLinkedList);
    }

    /*
     * removendo 100 elementos sempre na primeira posição
     */
    private static long removePrimeirosElementos(List<Integer> numeros) {
        long ini = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            numeros.remove(0); // removendo sempre o primeiro elemento
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

    private static long insereElementosNo(List<Integer> numeros, int quantidade) {
        long ini = System.currentTimeMillis();
        for (int i = 0; i < quantidade; i++) {
            numeros.add(i);
        }
        long fim = System.currentTimeMillis();
        return fim - ini;
    }

}