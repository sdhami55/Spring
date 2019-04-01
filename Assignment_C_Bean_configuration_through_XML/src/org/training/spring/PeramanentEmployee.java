package org.training.spring;

public class PeramanentEmployee extends Employee {
	
	private String employeeType;

	public PeramanentEmployee() {
		super();
		
	}

	public PeramanentEmployee(int id, String name, double salary, String employeeType) {
		super(id, name, salary, employeeType);
		
	}

	public PeramanentEmployee(String employeeType) {
		super();
		this.employeeType = employeeType;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	public void employeeDetails()
	{
		System.out.println("Id : "+getId());
		System.out.println("name : "+getName());
		System.out.println("salary : "+getSalary());
		System.out.println("employeeType : "+getEmployeeType());
	}
	
	public void init()
	{
		System.out.println("init mehtod in employee child class");
	}
	
	public void destroy()
	{
		System.out.println("destroy mehtod in employee child class");
	}

	@Override
	public String toString() {
		return "PeramanentEmployee [employeeType=" + employeeType + "]";
	}
	
	
	
	

}
