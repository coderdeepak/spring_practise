package org.spring.ioc.basic.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("collections/collections-example.xml");
		Customer customer = context.getBean("customer",Customer.class);
		System.out.println(customer);
	}

}
