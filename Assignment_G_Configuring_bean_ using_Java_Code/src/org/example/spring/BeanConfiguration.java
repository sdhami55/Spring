package org.example.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.spring")
public class BeanConfiguration {
	
	@Bean
	public Address getAddress()
	{
		Address address = new Address();
		address.setStreet("Hinjewadi");
		address.setCity("pune");
		address.setState("Uttar Pradesh");
		address.setCountry("India");
		
		return address;
	}
	
	@Bean
	public Customer getCuustomer()
	{
		Customer customer = new Customer(getAddress());
		
		return customer;
	}

}
