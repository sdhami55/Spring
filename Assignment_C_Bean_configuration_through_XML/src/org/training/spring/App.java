package org.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		PeramanentEmployee e=(PeramanentEmployee)context.getBean("peramanentEmployee");
		
		e.employeeDetails();
		
		((AbstractApplicationContext) context).registerShutdownHook();
	}

}
