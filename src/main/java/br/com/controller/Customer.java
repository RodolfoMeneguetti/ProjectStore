package br.com.controller;

public class Customer {

	private String descriptionCustomer;
	private String State;
	private String city;
	private int number;

	public Customer() {

	}

	public Customer(String descriptionCustomer, String state, String city, int number) {
		this.descriptionCustomer = descriptionCustomer;
		State = state;
		this.city = city;
		this.number = number;
	}

	public String getDescriptionCustomer() {
		return descriptionCustomer;
	}

	public void setDescriptionCustomer(String descriptionCustomer) {
		this.descriptionCustomer = descriptionCustomer;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Customer [descriptionCustomer=" + descriptionCustomer + ", State=" + State + ", city=" + city
				+ ", number=" + number + "]";
	}

}
