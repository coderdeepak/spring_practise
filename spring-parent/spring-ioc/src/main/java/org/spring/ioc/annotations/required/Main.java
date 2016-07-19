package org.spring.ioc.annotations.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations/required-example1.xml");
		Customer customer = context.getBean("customer",Customer.class);
		System.out.println(customer);
	}

}
