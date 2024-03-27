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

        System.out.println(costumer1);
        System.out.println("---------------------");
        System.out.println(costumer2);
        System.out.println("---------------------");

        List<Manga> mangas = List.of(m1, m2, m3, m4);
        System.out.println("============ Manga's list ================");
        System.out.print("[");
        for (Manga manga : mangas){
            if (manga.getName().equals(mangas.getLast().getName())){
                System.out.print(manga.getName());
            } else {
                System.out.print(manga.getName() + ", ");
            }
        }

        List<Manga> mangasCost1 = List.of(m1, m2, m4);
        List<Manga> mangasCost2 = List.of(m2, m3, m4);
        System.out.println("]");
        System.out.println("-------------------------------------------");

        Map<Costumer, List<Manga>> costListManga = new HashMap<>();
        costListManga.put(costumer1, mangasCost1);
        costListManga.put(costumer2, mangasCost2);

        for(Costumer key : costListManga.keySet()){
            System.out.print(key.getName() + " = [");
            for (Manga manga : costListManga.get(key)){
                if (costListManga.get(key).getLast().getName().equals(manga.getName())){
                    System.out.print(manga.getName());
                } else {
                    System.out.print(manga.getName() + ", ");
                }
            }
            System.out.println("]");
        }
    }

}
