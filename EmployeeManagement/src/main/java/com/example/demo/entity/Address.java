package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	private int id;
	
	private String address;

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
