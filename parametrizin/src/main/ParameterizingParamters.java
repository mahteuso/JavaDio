package main;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ParameterizingParamters {

    private static List<Car> cars = new ArrayList<>(
                                    List.of(new Car("Monza", "Azul", 1987),
                                            new Car("Tempra", "preto", 1998),
                                            new Car("Tipo", "Vermelho", 1996),
                                            new Car("Stilo", "Vermelho", 2010))
                                );

    public static void main(String[] args) {
        System.out.println("===== SelectionByColor ======");
        System.out.println(selectionByColor( cars, "Vermelho"));
        System.out.println("====== SelectionByYear ======");
        System.out.println(selectionByYear(cars, 1990));
    }

    public static List<Car> selectionByColor(List<Car> cars, String color){
        List<Car> carSelection = new ArrayList<>();
        for (Car car : cars ){
            if (car.getColor().equals(color)){
                carSelection.add(car);
            }
        }
        return carSelection;
    }

    public static List<Car> selectionByYear(List<Car> cars, Integer year){
        List<Car> carSelection = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() > year){
                carSelection.add(car);
            }
        }
        return carSelection;
    }
}
