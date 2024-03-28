package interfaces;

import domain.Car;

public interface CarPredicate {
    boolean test(Car car);
}
