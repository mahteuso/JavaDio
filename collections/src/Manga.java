import java.util.ArrayList;
import java.util.List;

public class Manga implements Comparable<Manga>{

    private String name;
    private Integer episodesNumber;
   public List<Manga> listManga = new ArrayList<>();

    public Manga(){

    }

    public Manga(String name, Integer episodesNumber) {
        this.name = name;
        this.episodesNumber = episodesNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEpisodesNumber() {
        return episodesNumber;
    }

    public void setEpisodesNumber(Integer episodesNumber) {
        this.episodesNumber = episodesNumber;
    }



    @Override
    public int compareTo(Manga o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                ", episodesNumber=" + episodesNumber +
                '}';
    }
}
