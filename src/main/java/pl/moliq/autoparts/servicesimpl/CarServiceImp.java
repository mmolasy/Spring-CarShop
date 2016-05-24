package pl.moliq.autoparts.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import pl.moliq.autoparts.domain.Car;
import pl.moliq.autoparts.repository.CarRepository;
import pl.moliq.autoparts.services.CarService;

@Service
@Configurable
public class CarServiceImp implements CarService{

	@Autowired
	CarRepository carRespoitory;
	
	public List<Car> getListOfCars() {
		return carRespoitory.getListOfCars();
	}

}
