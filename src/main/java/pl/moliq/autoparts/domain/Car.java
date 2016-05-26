package pl.moliq.autoparts.domain;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
	
	@Override
	public boolean equals(Object that){
		return EqualsBuilder.reflectionEquals(this, that, "brand", "model", "generation", "bodyVersion");	
	}
	
	@Override
	public int hashCode(){
		return HashCodeBuilder.reflectionHashCode(this, "brand", "model", "generation", "bodyVersion");
	}

}
