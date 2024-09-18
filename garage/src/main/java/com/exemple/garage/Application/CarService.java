package com.exemple.garage.Application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.garage.Domain.Car;
import  com.exemple.garage.Domain.CarDTO;
import  com.exemple.garage.Domain.CarMapper;
import com.exemple.garage.Infrastrucutre.CarRepository;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;
    @Autowired
    private CarMapper carMapper;
    // Obtener todos los coches
    public List<CarDTO> findAll() {
        List<Car> cars =  carRepository.findAll();
        return carMapper.toCarDTOList(cars);
    }

    // Crear un nuevo coche
    public Car createCar(CarDTO carDTO) {
        Car car = carMapper.carDTOToCar(carDTO);
        return carRepository.save(car);
    }
        
    // Obtener un coche por ID
    public CarDTO findById(Long id) {
        Car car = carRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        return carMapper.carToCarDTO(car);
    }

    public Optional<Car> updateColor(Long id, CarDTO carDTO) {
        return carRepository.findById(id).map(car -> {
            car.setColor(carDTO.getColor()); // Actualiza el color
            return carRepository.save(car);    // Guarda el coche actualizado
        });
    }
    
    // Eliminar un coche por ID
    public boolean deleteById(Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
