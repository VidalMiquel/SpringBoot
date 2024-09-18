package com.exemple.garage.Infrastrucutre;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exemple.garage.Domain.Car;

//Long --> @dId (Primery Key)
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
    boolean  deleteByBrand(String color);
}
