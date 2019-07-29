package com.example.spring03.model;

public class CustomerModel {
	private long id;
	private String name;
	private String address;
	private String email;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	public CustomerModel buildDomain() {
		CustomerModel customer = new CustomerModel();
		customer.setId(id);
		customer.setName(name);
		customer.setAddress(address);
		customer.setEmail(email);
		return customer;
		
	}
	
	public void buildModel(CustomerModel customer) {
		id = customer.getId();
		name = customer.getName();
		address = customer.getAddress();
		email = customer.getEmail();
	}
	
}
