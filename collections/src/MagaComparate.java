import java.util.Comparator;

public class MagaComparate implements Comparator<Manga> {

    @Override
    public int compare(Manga manga, Manga t1) {
        return Integer.compare(manga.getEpisodesNumber(), t1.getEpisodesNumber());
    }
}
