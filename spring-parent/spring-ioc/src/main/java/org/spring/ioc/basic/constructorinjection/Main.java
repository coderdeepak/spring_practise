package org.spring.ioc.basic.constructorinjection;

import org.spring.ioc.common.IOutputGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-constructor-injection.xml");
		 OutputHelper helper = (OutputHelper)context.getBean("outputHelper_id");
		 IOutputGenerator generator = helper.getOutputGenerator();
		 generator.generateOutput();

	}

}
