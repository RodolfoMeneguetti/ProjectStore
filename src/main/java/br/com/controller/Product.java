package br.com.controller;

public class Product {

	private String description; 
	private String Category; 
	private Double value; 
	
	public Product () {
		
	}

	public Product(String description, String category, Double value) {
		this.description = description;
		Category = category;
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", Category=" + Category + ", value=" + value + "]";
	}
	
	
	
}
 