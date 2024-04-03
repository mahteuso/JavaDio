package test;

import domain.Animes;

import java.util.ArrayList;
import java.util.List;

public class ReduceTest02 {

    private static List<Animes> animeList = new ArrayList<>(List.of(
            new Animes("Naruto", 3.99),
            new Animes("Naruto", 3.99),
            new Animes("Dragon Ball", 6.99),
            new Animes("Shurato", 8.99),
            new Animes("Pokemon", 1.99),
            new Animes("One Piece", 7.99),
            new Animes("Kingdom", 3.99),
            new Animes("Hunter x Hunter", 4.00),
            new Animes("FullMetal Alchemist", 3.99)
    ));

    public static void main(String[] args) {
       Double sum = animeList.stream()
                .filter(ln -> ln.getPrice() > 3)
                .distinct()
                .map(Animes::getPrice)
                .reduce(0.0, Double::sum);

        System.out.println(sum);
    }
}
