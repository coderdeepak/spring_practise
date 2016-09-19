package org.spring.ioc.annotations.postconstructpredestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("annotations/postconstructpredestroy.xml");
		CustomerService customerService = context.getBean("customerservice", CustomerService.class);
		System.out.println("b4 call of context.close");
		context.close();
	}
}
