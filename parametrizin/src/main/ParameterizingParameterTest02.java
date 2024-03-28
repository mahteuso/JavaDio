package main;

import domain.Car;
import interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ParameterizingParameterTest02 {

    private static List<Car> cars = new ArrayList<>(
            List.of(new Car("Monza", "Azul", 1987),
                    new Car("Tempra", "preto", 1998),
                    new Car("Tipo", "Vermelho", 1996),
                    new Car("Stilo", "Vermelho", 2010))
    );

    public static void main(String[] args) {
       List<Car> vermelho =  filterCar(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equalsIgnoreCase("vermelho");
            }
        });

        System.out.println(vermelho);
    }

    public static List<Car> filterCar(List<Car> cars, CarPredicate carPredicate){
        List<Car> carsPredicate = new ArrayList<>();
        for (Car car : cars){
            if (carPredicate.test(car)){
                carsPredicate.add(car);
            }
        }
        return carsPredicate;
    }

}
