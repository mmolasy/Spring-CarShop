package pl.moliq.autoparts.domain;

import java.util.Date;

public class Car {
	private String brand;
	private String model;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBodyVersion() {
		return bodyVersion;
	}
	public void setBodyVersion(String bodyVersion) {
		this.bodyVersion = bodyVersion;
	}
    public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	private String generation;
    
	private String bodyVersion;
	
	public String toString()
	{
		return brand+" "+model+" "+generation+" "+bodyVersion;
	}


}
