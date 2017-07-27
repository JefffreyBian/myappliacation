package com.controller.store.model;

public class Params{
	public orders getOrders() {
		return orders;
	}
	public void setOrders(orders orders) {
		this.orders = orders;
	}
	public production getProduction() {
		return production;
	}
	public void setProduction(production production) {
		this.production = production;
	}
	public manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public sale getSale() {
		return sale;
	}
	public void setSale(sale sale) {
		this.sale = sale;
	}
	public users getUsers() {
		return users;
	}
	public void setUsers(users users) {
		this.users = users;
	}
	public customer getCustomer() {
		return customer;
	}
	public void setCustomer(customer customer) {
		this.customer = customer;
	}
	private users users;
	private customer customer;
	private orders orders;
	private production production;
	private manufacturer manufacturer;
	private sale sale;

	
	
	
}

