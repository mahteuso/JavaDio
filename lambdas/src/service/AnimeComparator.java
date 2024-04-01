package service;

import domain.Anime;

import java.util.Comparator;

public class AnimeComparator implements Comparator<Anime>  {
    @Override
    public int compare(Anime anime, Anime t1) {
        return anime.getName().compareToIgnoreCase(t1.getName());
    }
}
