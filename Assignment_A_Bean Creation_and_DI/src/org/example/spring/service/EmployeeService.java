package org.example.spring.service;

import org.example.spring.model.Employee;

public class EmployeeService implements ServiceInterface{
	
	Employee employee;

	
	
	
	public EmployeeService() {
		super();
		// TODO Auto-generated constructor stub
	}




	public EmployeeService(Employee employee) {
		super();
		this.employee = employee;
	}





	public Employee getEmployee() {
		return employee;
	}




	public void setEmployee(Employee employee) {
		this.employee = employee;
	}



	
	

	@Override
	public String toString() {
		return "EmployeeService [employee=" + employee + "]";
	}




	@Override
	public void getDetails() {
		System.out.println("Id : "+ employee.getId());
		System.out.println("name : "+ employee.getName());
		System.out.println("salary : "+ employee.getSalary());
		System.out.println("dept : "+ employee.getDept());
		
	}

}
