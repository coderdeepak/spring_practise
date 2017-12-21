package org.Spring.aop.old.pointcut.advisor.example2;

import org.Spring.aop.common.SimpleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("example2.xml");
		// Please note we are getting bean of proxy object and assigning it to SimpleService.   
		SimpleService simpleService = (SimpleService)context.getBean("simpleServiceProxy");
		simpleService.printNameId();
		simpleService.sayHello("Deepak");
	}
}
