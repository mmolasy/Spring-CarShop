package pl.moliq.autoparts.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import pl.moliq.autoparts.domain.Car;

public interface CarRepository {
	List<Car> getListOfCars();

}
