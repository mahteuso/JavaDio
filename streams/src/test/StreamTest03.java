package test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest03 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 40)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("===============================");

        IntStream.rangeClosed(1, 20)
                .filter( n -> n % 2 != 0)
                .average()
                .ifPresent(System.out::println);
    }
}
