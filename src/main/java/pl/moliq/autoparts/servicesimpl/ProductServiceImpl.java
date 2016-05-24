package pl.moliq.autoparts.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import pl.moliq.autoparts.domain.Product;
import pl.moliq.autoparts.repository.ProductRepository;
import pl.moliq.autoparts.services.ProductService;

@Configurable
@Service
public class ProductServiceImpl implements ProductService{

@Autowired 
ProductRepository productRepository;

public List<Product> getAllProducts() {
	return productRepository.getAllProducts();
}

public Product getProductById(long id) {
	return productRepository.getProductById(id);
}

public List<Product> getProductsByCategory(String category) {
	return productRepository.getProductsByCategory(category);
}

public List<Product> removeProductById(long id) {
	return productRepository.removeProductById(id);
} 


}
