package fr.devcrea.demo.repository;

import fr.devcrea.demo.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface GarageRepository extends CrudRepository<Car, Long> {
}
