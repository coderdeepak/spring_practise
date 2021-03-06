package org.spring.ioc.basic.constructorinjection.argument.ambiguity.solution;

import org.spring.ioc.basic.constructorinjection.argument.ambiguity.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"constructor-ambugity-solution-bytype.xml");
		Customer customer = context.getBean("customer_id", Customer.class);
		System.out.println(customer.toString());

	}

}
