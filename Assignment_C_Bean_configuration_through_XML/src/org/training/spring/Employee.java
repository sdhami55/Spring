package org.training.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
	
	private int id;
	private String name;
	private double salary;
	private String employeeType;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Employee(int id, String name, double salary, String employeeType) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	



	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public String getEmployeeType() {
		return employeeType;
	}




	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", employeeType=" + employeeType + "]";
	}




	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Implementing afterPropertiesSet() method of Interface InitializingBean");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Implementing destroy() method of Interface DisposableBean");
	}
	
	
	
	

}
