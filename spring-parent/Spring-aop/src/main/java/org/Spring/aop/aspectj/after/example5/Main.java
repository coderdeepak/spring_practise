package org.Spring.aop.aspectj.after.example5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop-aspectj-after-annotation.xml");
		EmployeeService employeeService = (EmployeeService)context.getBean("employeeService");
		Employee employee = employeeService.getEmployee();
		System.out.println("** after calling getEmployee **");
		String name = employee.getName();
		System.out.println(" after calling getName " + "Employee name is " + name);
	}
}
