package org.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {
	
	
	
	private Address address;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Customer(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}
	
	

}
