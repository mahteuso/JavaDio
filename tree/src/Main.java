import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        BinTree<String> tree = new BinTree<>();

        tree.insert("Mateus Laranjeira");
        tree.insert("Julia Leite");
        tree.insert("Madalena Leite");

        tree.insert("Helena Dias");
        tree.insert("Marco Maria");

        tree.displayPreOrdered();
        tree.displayOrdered();
        tree.getElement("Madalena Leite");
        tree.displayOrdered();

        Set<SetHashTest> car = new TreeSet<>();


        car.add(new SetHashTest("Tipo"));
        car.add(new SetHashTest("Monza"));
        car.add(new SetHashTest("Tempra"));
        car.add(new SetHashTest("Gol"));
        System.out.println("----------------------------------------");
        System.out.println(car);


    }
}
