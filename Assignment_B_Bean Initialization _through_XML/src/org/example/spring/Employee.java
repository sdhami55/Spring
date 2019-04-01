package org.example.spring;

import java.util.List;

public class Employee {
	
	private List<String> projects;
	private Address address;
	
	public Employee() {
		super();
	}

	public Employee(List<String> projects, Address address) {
		super();
		this.projects = projects;
		this.address = address;
	}

	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [projects=" + projects + ", address=" + address + "]";
	}
	
	
	
	
	

}
