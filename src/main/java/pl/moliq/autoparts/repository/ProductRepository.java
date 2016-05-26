package pl.moliq.autoparts.repository;

import java.util.List;

import pl.moliq.autoparts.domain.Product;

public interface ProductRepository {

	public List<Product> getAllProducts();
	public Product getProductById(long id);
	public List<Product> getProductsByCategory(String category);
	public List<Product> removeProductById(long id);
	public List<Product> addProductToList(Product product);
	
}
