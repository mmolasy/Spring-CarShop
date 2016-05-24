package pl.moliq.autoparts.services;

import java.util.List;

import pl.moliq.autoparts.domain.Product;

public interface ProductService {
	public List<Product> getAllProducts();
	public Product getProductById(long id);
	public List<Product> getProductsByCategory(String category);
	public List<Product> removeProductById(long id);
}
