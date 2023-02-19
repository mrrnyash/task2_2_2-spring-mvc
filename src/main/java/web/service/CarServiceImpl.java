package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;
import java.util.stream.Stream;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> CARS = Stream.of(
            new Car(1L, "BMW", "black", 2.0),
            new Car(2L, "Toyota", "silver", 2.0),
            new Car(3L, "Renault", "brown", 1.8),
            new Car(4L, "Lada", "white", 1.2),
            new Car(5L, "Nissan", "blue", 3.0)
    ).toList();
    

    @Override
    public List<Car> listCars(Integer count) {
        return CARS.stream().limit(count).toList();
    }

}

