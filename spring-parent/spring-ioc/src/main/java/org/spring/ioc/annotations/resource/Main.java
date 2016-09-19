package org.spring.ioc.annotations.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations/resource.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.getCompany());
		System.out.println(employee.getAddress());
	}
}
