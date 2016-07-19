package org.spring.ioc.beanlifecycle.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle/example1.xml");
		CustomerService customer = context.getBean("customerservice_id",CustomerService.class);
		System.out.println(customer.getMessage());
		((ClassPathXmlApplicationContext)context).close();
	}
}
