package test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        System.out.println("Números pares");
        Stream.iterate(0, n -> n + 1).limit(20).filter(p -> p % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println();

        // Sequência de Fibonnacy
        // 0, 1, 1, 2, 3, 5, 8, 13, 21
        // (0, 1) (1, 1) (1, 2) (2, 3) (3, 5)

        System.out.println("------------------------------------------");
        System.out.println("Fibonacci usando a classe Stream");
        System.out.println("------------------------------------------");
        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[0] + n[1]}).limit(5).forEach(a -> System.out.print(Arrays.toString(a) + ", "));

        System.out.println();


        List<int[]> inteiro = new ArrayList<>();
        inteiro.add(new int[]{0, 1});
        inteiro.add(new int[]{1, 1});
        inteiro.add(new int[]{1, 2});


        System.out.println("================ Fibonacci ================");
        List<int[]> arrays = new ArrayList<>();
        for (int[] i : Fibonacci(7, 0, 0, 0, arrays)) {
            System.out.print(Arrays.toString(i));
        }

        System.out.println();
        System.out.println("================ Fibonacci ================");

        List<Integer> list = new ArrayList<>();
        List<Integer> fibo = fibonacciTwo(7, 0, 0, 0, list);
        System.out.print("Fibocacci Sequency Recursivo = [");
        for (int i : fibo) {
            if (fibo.getLast() == i) {
                System.out.println(i + "]");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        List<Integer> newList = new ArrayList<>();
        List<Integer> fibonacci = fibo(7, 0, 0, 0, newList);
        System.out.print("Fibocacci Sequency Estruturado = [");
        for (int i : fibonacci){
            if (fibonacci.getLast() == i){
                System.out.println(i + "]");
            } else {
                System.out.print(i + ", ");
            }
        }


    }

    private static List<int[]> Fibonacci(int limit, int x, int y, int tamanho, List<int[]> list) {
        if (y == 0 && x == 0) {
            int[] array = new int[]{x, x + 1};
            list.add(array);
            tamanho++;
            return Fibonacci(limit, array[0], array[1], tamanho, list);
        } else if (y != 0 && tamanho < limit) {
            int[] array = new int[]{y, x + y};
            list.add(array);
            tamanho++;
            return Fibonacci(limit, array[0], array[1], tamanho, list);

        } else {
            return list;
        }
    }

    private static List<Integer> fibonacciTwo(Integer limit, Integer size, Integer init, Integer fim, List<Integer> list) {

        if (init == 0 && fim == 0) {
            fim = init + 1;
            list.add(init);
            list.add(fim);
            size++;
            return fibonacciTwo(limit, size, init, fim, list);
        } else if (fim != 0 && size < limit) {
            Integer temp = fim;
            fim = init + fim;
            init = temp;
            list.add(fim);
            size++;
            return fibonacciTwo(limit, size, init, fim, list);
        } else {
            return list;
        }
    }

    private static List<Integer> fibo(Integer limit, Integer size, Integer init, Integer fim, List<Integer> list) {
        while (size < limit) {
            if (init == 0 && fim == 0) {
                fim = init + 1;
                list.add(init);
                list.add(fim);

            }else if(fim != 0){
                Integer temp = fim;
                fim = init + fim;
                init = temp;

                list.add(fim);
            }
            size++;
        }
        return list;
    }

}
