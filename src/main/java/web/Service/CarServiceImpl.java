package web.Service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCountCar(int count) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Red", "Ferrari", 34541212L));
        carList.add(new Car("Blue", "Pontiac", 78866517L));
        carList.add(new Car("White", "Ford Mustang", 98568135L));
        carList.add(new Car("Yellow", "Corvette", 10189915L));
        carList.add(new Car("Black", "Chrysler", 13221311L));
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
