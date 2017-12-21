package org.Spring.aop.aspectj.example4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-aspectj-annotation.xml");
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
		System.out.println("** b4 calling getEmployee **");
		Employee employee = employeeService.getEmployee();
		System.out.println("** b4 calling getName **");
		String name = employee.getName();
		System.out.println("Employee name is " + name);
	}
}
