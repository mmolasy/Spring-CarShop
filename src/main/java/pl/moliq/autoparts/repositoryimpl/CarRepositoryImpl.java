package pl.moliq.autoparts.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import pl.moliq.autoparts.domain.Car;
import pl.moliq.autoparts.repository.CarRepository;

@Repository
public class CarRepositoryImpl implements CarRepository{

	List<Car> listOfCars = new ArrayList<Car>();
	
	public CarRepositoryImpl()
	{
		Car c1 = new Car();
		c1.setModel("A4");
		c1.setBrand("Audi");
		c1.setBodyVersion("Sedan");
		c1.setGeneration("B5");
		listOfCars.add(c1);
		
		Car c2 = new Car();
		c2.setModel("A6");
		c2.setBrand("Audi");
		c2.setBodyVersion("Combi");
		c2.setGeneration("C6");
		listOfCars.add(c2);
		
		Car c3 = new Car();
		c3.setModel("A8");
		c3.setBrand("Audi");
		c3.setBodyVersion("D6");
		c3.setGeneration("Sedan");
		listOfCars.add(c3);
		
		Car c4 = new Car();
		c4.setModel("A3");
		c4.setBrand("Audi");
		c4.setBodyVersion("Hatchback");
		c4.setGeneration("A3");
		listOfCars.add(c4);
		
		Car c5 = new Car();
		c5.setModel("Punto");
		c5.setBrand("Fiat");
		c5.setBodyVersion("Hatchback");
		c5.setGeneration("MK1");
		listOfCars.add(c5);
		System.out.println("jaja");
	}
	
	public List<Car> getListOfCars() {
		return listOfCars;
	}
	

}
