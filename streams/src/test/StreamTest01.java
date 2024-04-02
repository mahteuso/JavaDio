package test;

import domain.Animes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Order Anime by title
// retrieve the first 3 Anime with price less than 4
public class StreamTest01 {

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

        List<String> animes = new ArrayList<>();
        System.out.println(animeList);
        System.out.println("=========== Order Animes =============");
        animeList.sort(Comparator.comparing(Animes::getTitle));
        System.out.println(animeList);
        System.out.println("=================================");

        for (Animes anime : animeList) {
            if (anime.getPrice() <= 4) {
                animes.add(anime.getTitle());
            }
            if (animes.size() >= 3) {
                break;
            }
        }

        System.out.println(animes);

        // Usando a classe Stream

        List<String> animesStream = animeList.stream()
                .sorted(Comparator.comparing(Animes::getTitle))
                .filter(s -> s.getPrice() <= 4)
                .limit(3)
                .map(Animes::getTitle)
                .collect(Collectors.toList());

        System.out.println("-----------------------------");
        System.out.println(animesStream);


        Long count1 = animeList.stream().filter(ln -> ln.getPrice() <= 4).count();
        Long count2 = animeList.stream().filter(ln -> ln.getPrice() <= 4).distinct().count();

        System.out.println("-----------------------------");
        System.out.println(count1);
        System.out.println("-----------------------------");
        System.out.println(count2);

        List<String> titleAnime = animeList.stream()
                .sorted(Comparator.comparing(Animes::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(6)
                .distinct()
                .map(Animes::getTitle)
                .collect(Collectors.toList());

        System.out.println("------------------------");
        System.out.println(titleAnime);
    }


}
