import javax.imageio.plugins.tiff.TIFFDirectory;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        Manga m1 = new Manga("Naruto", 3000, 0);
        Manga m2 = new Manga("Hunter", 655, 234);
        Manga m3 = new Manga("Berseker", 6000, 45);
        Manga m4 = new Manga("Kingdom", 12234, 0);

        Manga listManga = new Manga();
        listManga.listManga.add(m1);
        listManga.listManga.add(m2);
        listManga.listManga.add(m3);
        listManga.listManga.add(m4);

        System.out.println(listManga.listManga);

        Iterator<Manga> iteratorManga = listManga.listManga.iterator();


        while (iteratorManga.hasNext()) {
            Manga currentManga = iteratorManga.next();
            if (currentManga.getLikes() == 0) {
                iteratorManga.remove();
            }
        }

        System.out.println(listManga.listManga);

    }
}
