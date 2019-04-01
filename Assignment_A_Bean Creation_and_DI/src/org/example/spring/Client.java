package org.example.spring;

import org.example.spring.service.EmployeeService;
import org.example.spring.service.ServiceInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String args[])
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		
		ServiceInterface service= (EmployeeService)context.getBean("employeeService");
		
		service.getDetails();
	}
	
	
	

	
	

}
