package org.Spring.aop.aspectj.afterreturning.example7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-aspectj-afterreturning-annotation.xml");
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
		Employee employee = employeeService.getEmployee();
		String name = employee.getName();
		System.out.println("employee name is "+name);

	}

}