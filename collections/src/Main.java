import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Manga m1 = new Manga("Naruto", 3000);
        Manga m2 = new Manga("Hunter", 655);
        Manga m3 = new Manga("Berseker", 6000);
        Manga m4 = new Manga("Kingdom", 3029);

        Manga listManga = new Manga();
        listManga.listManga.add(m1);
        listManga.listManga.add(m2);
        listManga.listManga.add(m3);
        listManga.listManga.add(m4);

        System.out.println(listManga.listManga);

        listManga.listManga.sort(new MagaComparate());

        System.out.println(listManga.listManga);

        Collections.sort(listManga.listManga);

        System.out.println(listManga.listManga);

        System.out.println(Collections.binarySearch(listManga.listManga, m1));
    }
}
