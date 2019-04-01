package org.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Employee employee =(Employee)context.getBean(Employee.class);
		
		Department dept = (Department)context.getBean(Department.class);
		
		employee.employeeDetails(dept);
		
		
	}

}
