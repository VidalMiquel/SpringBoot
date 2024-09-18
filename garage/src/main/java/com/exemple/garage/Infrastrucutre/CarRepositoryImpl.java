package com.exemple.garage.Infrastrucutre;

import org.springframework.stereotype.Component;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class CarRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    //@Autowired
    //private CarRepository carRepository;

    // Method to delete cars by brand
    public boolean deleteByBrand(String brand) {
        // HQL query to delete cars with the specified brand
        String hql = "DELETE FROM Car c WHERE c.brand = :brand"; // Ensure 'Car' is the entity name

        // Execute the delete operation
        int deletedCount = entityManager.createQuery(hql)
                .setParameter("brand", brand)
                .executeUpdate();

        // Return true if any cars were deleted, otherwise false
        return deletedCount > 0;
    }

}
