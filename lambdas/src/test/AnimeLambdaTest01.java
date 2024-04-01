package test;

import domain.Anime;
import service.AnimeComparator;
import service.ComparatorAnimes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class AnimeLambdaTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("One Piece", 3000),
                new Anime("Hunter x Hunter", 2000),
                new Anime("Kingdom", 1500),
                new Anime("Naruto", 4000)
        ));

        // Usando sort com a classe Comparator
        // animes.sort(new AnimeComparator());

        // Usando a classe Collections por meio da implementação da Interface Comparable
        // Collections.sort(animes);

        // Usando a classe Collections com a implementação in-build
        //Collections.sort(animes, (a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

        //  Usando  a implementação de um método de classe usando Lambda
        // Collections.sort(animes, (a1, a2) -> ComparatorAnimes.compareByTitle(a1, a2));

        // Usando  um método de uma instância de classe

        //Collections.sort(animes, (a1, a2) -> new ComparatorAnimes().compareByTitleNoStatic(a1, a2));
        animes.sort(new ComparatorAnimes()::compareByTitleNoStatic);

        System.out.println(animes);

        System.out.println("--------------------------");

        List<String> string = new ArrayList<>(List.of("1", "2", "3", "4"));

        Function<String, Integer> integerList = Integer::parseInt;

        List<Integer> intList1 = new ArrayList<>();

        for (String s : string) {
            Integer i = integerList.apply(s);
            intList1.add(i);
        }

        System.out.println(intList1);

        System.out.println("--------------------------");


        List<Integer> newList = new ArrayList<>();

        List<Integer> listInteger = new ArrayList<>(strintToInteger(string, Integer::parseInt));
        System.out.println(listInteger);

    }

    private static <T, R> List<R> strintToInteger(List<T> list, Function<T, R> function) {
        List<R> listR = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            listR.add(r);
        }

        return listR;
    }


}
