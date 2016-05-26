package pl.moliq.autoparts.domain;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Product {

private long id;

@Size(min=3, max=25, message="Dlugosc powinna byc z przedzialu 3-5")
private String name;
@NotNull(message="To pole nie moze byc puste")
private String category;

@NotNull(message="To pole nie moze byc puste")
private double price;


@Size(max=40, message="Opis nie powinien przekraczac 40 znakow")
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

@Override
public boolean equals(Object that)
{
	return EqualsBuilder.reflectionEquals(this, that, "id", "name", "price");
}

@Override
public int hashCode(){
	return HashCodeBuilder.reflectionHashCode(this, "id", "name", "price");
}
}
