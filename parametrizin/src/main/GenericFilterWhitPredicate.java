package main;

import domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilterWhitPredicate {

    private static List<Car> cars = new ArrayList<>(
            List.of(new Car("Monza", "Azul", 1987),
                    new Car("Tempra", "preto", 1998),
                    new Car("Tipo", "Vermelho", 1996),
                    new Car("Stilo", "Vermelho", 2010))
    );



    public static void main(String[] args) {
        List<Car> redCars = filter(cars, car -> car.getColor().equalsIgnoreCase("vermelho"));
        System.out.println(redCars);
        System.out.println("==================================");
        List<Car> newCars = filter(cars, car -> car.getYear() > 1990);
        System.out.println(newCars);
        System.out.println("============================");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 12);
        List<Integer> pairNum = filter(numbers, num -> num % 2 == 0);
        System.out.println(pairNum);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filter = new ArrayList<>();
        for (T var : list){
            if (predicate.test(var)){
                filter.add(var);
            }
        }
        return filter;
    }
}
