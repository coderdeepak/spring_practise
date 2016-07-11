package org.spring.ioc.basic.helloworld;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Instantiate Spring IoC container 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-helloworld.xml");
		 
		 HelloWorld helloworld =  (HelloWorld)applicationContext.getBean("hellowWorld_id");
		 System.out.println(helloworld.getName());

	}

}
