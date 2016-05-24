package pl.moliq.autoparts.domain;

import java.util.List;

public class Product {
private long id;
private String name;
private String category;
private double price;
private String description;
private List<Car> typesOfCar;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public List<Car> getTypesOfCar() {
	return typesOfCar;
}
public void setTypesOfCar(List<Car> typesOfCar) {
	this.typesOfCar = typesOfCar;
}
}
