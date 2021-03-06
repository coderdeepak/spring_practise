package org.spring.ioc.inheritance.example1;

import org.spring.ioc.inheritance.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("inheritance/example-1.xml");
		Customer customer = context.getBean("customer",Customer.class);
		System.out.println(customer);
	}

}
