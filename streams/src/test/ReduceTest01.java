package test;

import java.util.List;

public class ReduceTest01 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 20, 5, 6, 7, 8, 9, 10);

        nums.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);

        System.out.println("------------------------------");

        System.out.println(nums.stream().reduce(0, Integer::sum));
        System.out.println("------------------------------");

        nums.stream().reduce((x, y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println("------------------------------");
        System.out.println(nums.stream().reduce(0, Integer::max));
        System.out.println("===============================");
        System.out.println(maior(nums));

    }

    private static Integer maior(List<Integer> list) {
        Integer maior = 0;
        for (Integer num : list) {
            if (maior < num) {
                maior = num;
            }
        }
        return maior;
    }
}
