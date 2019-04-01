package org.example.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee e=(Employee)context.getBean("employee");
		
		System.out.println(e);
	}

}
