import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example01List {
    public static void main(String[] args) {


        // Crie uma lista e adicione 7 notas.
        List<Double> notes = new ArrayList<>();
        notes.add(5.5);
        notes.add(5.9);
        notes.add(7.2);
        notes.add(7.0);
        notes.add(9.1);
        notes.add(4.1);
        notes.add(5.0);
        notes.add(4.0);

        // Remova as notas menores que 7

        System.out.println(notes);
        System.out.println("---------------------");
        double noteMin = 7;
        int value = 0;
        for (int i = 0; i < notes.size(); i++){
            if (notes.get(i) < noteMin){
                notes.remove(i);
            }
        }


        System.out.println(notes);

        System.out.println(notes.toString());
        System.out.println(notes.indexOf(5d));
        System.out.println(notes.indexOf(7d));


        // Adicione na lista o nota 8.0 na posição 4
        notes.add(4, 8d);
        System.out.println(notes.toString());
        System.out.println(notes.get(0));

        // Mostre o índce da nota 5.0
        double note = 5.0;
        for (int i = 0; i < notes.size(); i++) {
            if (note == notes.get(i)) {
                System.out.println("note: " + note + " in position: " + i);
            }
        }

        // Substitua a nota 5 pela nota 6.5

        notes.set(notes.indexOf(5d), 4.0);
        System.out.println(notes);

        // Exiba a menor nota

        System.out.println(Collections.min(notes));
        noteMin = notes.get(0);
        value = 1;
        while (value < notes.size()) {
            System.out.println(notes.size());

            if (notes.get(value) < noteMin) {
                noteMin = notes.get(value);

            }

            value++;
        }
        System.out.println("Menor nota: " + noteMin);
        // Mostre a maior nota
        double noteMax = notes.get(0);
        value = 1;
        while (value < notes.size()) {

            if (notes.get(value) > noteMax) {
                noteMax = notes.get(value);
            }
            value++;
        }

        System.out.println("Maior nota: " + noteMax);

        // Mostre a média das notas

        double soma = 0;

        for (double nota : notes){
            soma += nota;
        }
        double media = soma / (notes.size() - 1) ;

        System.out.println("Média das notas:" + String.format("%.2f", media));

        notes.remove(5.5);
        System.out.println(notes);

       // Remova toda a lista

        notes.removeAll(notes);
        System.out.println(notes);

        // Veja se a lista está vazia

        System.out.println(notes.isEmpty());
    }
}
