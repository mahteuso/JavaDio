import java.util.ArrayList;
import java.util.List;

public class Manga implements Comparable<Manga>{

    private String name;
    private Integer episodesNumber;

    private Integer likes;
    public List<Manga> listManga;

    public Manga(){

    }
    public Manga(String name, Integer episodesNumber){
        this.name = name;
        this.episodesNumber = episodesNumber;
    }

    public Manga(String name, Integer episodesNumber, Integer likes){
        this(name, episodesNumber);
        this.likes = likes;
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

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Manga manga) {
        return this.getName().compareTo(manga.getName());
    }
}
