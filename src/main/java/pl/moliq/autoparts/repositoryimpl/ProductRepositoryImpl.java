package pl.moliq.autoparts.repositoryimpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import pl.moliq.autoparts.domain.Car;
import pl.moliq.autoparts.domain.Product;
import pl.moliq.autoparts.repository.CarRepository;
import pl.moliq.autoparts.repository.ProductRepository;
import pl.moliq.autoparts.services.CarService;
import pl.moliq.autoparts.servicesimpl.CarServiceImp;

@Repository
public class ProductRepositoryImpl implements ProductRepository{
	
	
	
	private List<Product> productList = new ArrayList<Product>();

	
	CarRepository carRepository = new CarRepositoryImpl();
	
	
	public ProductRepositoryImpl()
	{
		
		Product p1 = new Product();
		p1.setId(1);
		p1.setCategory("Hamulce");
		p1.setDescription("Hamulce sportowe o podwyższonej odporności");
		p1.setName("Brembo P10000");
		p1.setPrice(300);
		List<Car> p1car = new ArrayList<Car>();
		System.out.println("hej");
		p1car.add(carRepository.getListOfCars().get(0));
		p1car.add(carRepository.getListOfCars().get(2));
		p1.setTypesOfCar(p1car);
		productList.add(p1);

		Product p2 = new Product();
		p2.setId(2);
		p2.setCategory("Wycieraczki");
		p2.setDescription("Wycieraczki o długiej żywotności");
		p2.setName("Clear Window 2000");
		p2.setPrice(30);
		List<Car> p2car = new ArrayList<Car>();
		p2car.add(carRepository.getListOfCars().get(1));
		p2car.add(carRepository.getListOfCars().get(4));
		p2car.add(carRepository.getListOfCars().get(2));
		p2.setTypesOfCar(p2car);
		productList.add(p2);

		Product p3 = new Product();
		p3.setId(3);
		p3.setCategory("Olej Silnikowy");
		p3.setDescription("Olej silnikowy przeznaczony do silników Audi");
		p3.setName("10W40 1L");
		p3.setPrice(40);
		List<Car> p3car = new ArrayList<Car>();
		p3car.add(carRepository.getListOfCars().get(0));
		p3car.add(carRepository.getListOfCars().get(1));
		p3car.add(carRepository.getListOfCars().get(2));
		p3.setTypesOfCar(p3car);

		productList.add(p3);
		
	}

	
	public List<Product> getAllProducts() {
		return productList;
	}

	public Product getProductById(long id) {
		
		Product productFounded=null;
		
		try{
		for(Product x: productList)
		{
			if(x.getId() == id)
				productFounded = x;
		}
		return productFounded;
		}catch(NullPointerException e){
			System.err.println("Product not found");
		}
		return null;
	}

	public List<Product> getProductsByCategory(String category) {
		List<Product> listProductsByCategory = new ArrayList<Product>();
		for (Product x: productList)
		{
			if(x.getCategory().equals(category))
				listProductsByCategory.add(x);
		}
		return listProductsByCategory;
			
	}

	public List<Product> removeProductById(long id) {
		productList.remove(getProductById(id));
		return productList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}


	public List<Product> addProductToList(Product product) {
		productList.add(product);
		return productList;
	}
	

}
