import java.lang.Object;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class TestMaps {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Mateus");
        Costumer costumer2 = new Costumer("Helena");

        Manga m1 = new Manga("Naruto", 3000);
        Manga m2 = new Manga("Hunter", 655);
        Manga m3 = new Manga("Berseker", 6000);
        Manga m4 = new Manga("Kingdom", 3029);

        List<Manga> cost1ListManga = List.of(m1, m3, m4);
        List<Manga> cost2ListManga = List.of(m1, m2, m3);

        Map<Costumer, List<Manga>> costManga = new HashMap<>();
        costManga.put(costumer1, cost1ListManga);
        costManga.put(costumer2, cost2ListManga);

        for (Costumer key : costManga.keySet()) {
            System.out.print(key.getName() + " =[");
            for (Manga manga : costManga.get(key)) {
                if (costManga.get(key).getLast().getName().equals(manga.getName())) {
                    System.out.print(manga.getName());
                } else {
                    System.out.print(manga.getName() + ", ");
                }
            }
            System.out.println("]");
        }


    }

}
