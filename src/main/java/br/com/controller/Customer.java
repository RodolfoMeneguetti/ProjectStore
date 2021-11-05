package br.com.controller;

public class Customer {

	private String nome;
	private String State;
	private String city;
	private String street;
	private int number;
	private br.com.controller.Enum.CustomerType CustomerType = br.com.controller.Enum.CustomerType.GOLD;

	public Customer() {

	}

	public Customer(String nome, String state, String city, int number) {
		this.nome = nome;
		State = state;
		this.city = city;
		this.number = number;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public br.com.controller.Enum.CustomerType getCustomerType() {
		return CustomerType;
	}

	public void setCustomerType(br.com.controller.Enum.CustomerType customerType) {
		CustomerType = customerType;
	}
	
	@Override
	public String toString() {
		return "Customer [descriptionCustomer=" + nome + ", State=" + State + ", city=" + city
				+ ", number=" + number + "]";
	}

}
