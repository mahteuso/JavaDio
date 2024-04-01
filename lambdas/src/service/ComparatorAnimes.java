package service;

import domain.Anime;

public class ComparatorAnimes {

    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getName().compareToIgnoreCase(a2.getName());
    }

    public int compareByTitleNoStatic(Anime a1, Anime a2){
        return a1.getName().compareToIgnoreCase(a2.getName());
    }
}
