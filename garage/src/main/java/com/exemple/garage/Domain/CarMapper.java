package com.exemple.garage.Domain;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    public CarDTO carToCarDTO(Car car){
        CarDTO carDTO = new CarDTO(car.getColor(), car.getBrand(), car.getMaxSpeed());
        return carDTO;
    } 

    public Car carDTOToCar(CarDTO carDTO) {
        // Create a Random object
        Random random = new Random();

        // Generate a random price (for example, between 10,000 and 50,000)
        int randomPrice = 10000 + (50000 - 10000) * random.nextInt(10);

        // Create a Car object with the additional random price
        Car car = new Car(carDTO.getColor(), carDTO.getBrand(), carDTO.getMaxSpeed(), randomPrice);
        return car;
    }

    public List<CarDTO> toCarDTOList(List<Car> cars){
        return cars.stream()
                    .map(this::carToCarDTO) // Use instance method reference
                    .collect(Collectors.toList());
    }

}
