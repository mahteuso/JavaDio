import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example02List {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mateus", 10, "marrom");
        Cat cat2 = new Cat("Helena", 20, "amarela");
        Cat cat3 = new Cat("Julia", 8, "branca");

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        Collections.sort(cats);

        System.out.println(cats);

       cats.sort(new ComparateAgeCats());

        System.out.println(cats);

    }
}
