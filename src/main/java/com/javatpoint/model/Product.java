package com.javatpoint.model;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String item;

	private float price;

	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Product [productId=" + id + ", name=" + item + ", price=" + price + ", address=" + address.toString()
				+ "]";
	}

}
