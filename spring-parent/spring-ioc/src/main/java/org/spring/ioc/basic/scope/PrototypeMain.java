package org.spring.ioc.basic.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class PrototypeMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("scope/prototype-example.xml");
		CustomerService customer1 = context.getBean("customer_id", CustomerService.class);
		customer1.setMessage("First object created");
		System.out.println("message from first object-->" + customer1.getMessage());
		
		System.out.println("Lets see what happens when we call it twice");
		CustomerService customer2= context.getBean("customer_id", CustomerService.class);
		System.out.println("If returns new instance getMessage would return null , if it is same instance getMessage would return the meesage First object created ");
		System.out.println(customer2.getMessage());
	}
}
