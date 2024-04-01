package domain;

public class Anime implements Comparable<Anime> {
    private String name;
    private Integer episodes;

    public Anime(String name, Integer episodes) {
        this.name = name;
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    public void setEpisodes(Integer episodes) {
        this.episodes = episodes;
    }

    @Override
    public int compareTo(Anime anime) {
        return this.getName().compareToIgnoreCase(anime.getName());
    }

    @Override
    public String toString() {
        return "Amine{" +
                "name='" + name + '\'' +
                ", size=" + episodes +
                '}';
    }


}
