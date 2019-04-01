package org.example.spring;

public class Employee {
	
	private String id;
	private String name;
	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public void employeeDetails(Department dept)
	{
		System.out.println("id :" + id);
		System.out.println("name :" + name);
		System.out.println("Address :" + address);
		System.out.println("DeptNo :" + dept.getDeptNo());
		System.out.println("DeptName :" + dept.getDeptName());
	}
	
	

}
