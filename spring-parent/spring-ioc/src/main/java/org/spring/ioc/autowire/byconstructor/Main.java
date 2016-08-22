package org.spring.ioc.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/xml/byconstructor.xml");
		EmployeeBean employee = context.getBean("employee", EmployeeBean.class);
		System.out.println(employee);
	}
}
