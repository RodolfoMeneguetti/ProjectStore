package br.com.controller;

public class Provider {
	
	private String DescriptionProvider; 
	private String Category; 
	
	public Provider() {
		
	}

	public Provider(String descriptionProvider, String category) {
		super();
		DescriptionProvider = descriptionProvider;
		Category = category;
	}

	public String getDescriptionProvider() {
		return DescriptionProvider;
	}

	public void setDescriptionProvider(String descriptionProvider) {
		DescriptionProvider = descriptionProvider;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	@Override
	public String toString() {
		return "Provider [DescriptionProvider=" + DescriptionProvider + ", Category=" + Category + "]";
	}
	
	
	
	
	

}
