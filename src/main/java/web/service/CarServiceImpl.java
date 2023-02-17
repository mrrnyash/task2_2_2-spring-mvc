package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1L, "BMW", "black", 2.0));
        cars.add(new Car(2L, "Toyota", "silver", 2.0));
        cars.add(new Car(3L, "Renault", "brown", 1.8));
        cars.add(new Car(4L, "Lada", "white", 1.2));
        cars.add(new Car(5L, "Nissan", "blue", 3.0));
    }

    @Override
    public List<Car> listCars(Integer count) {
        return cars.stream().limit(count).toList();
    }

}

