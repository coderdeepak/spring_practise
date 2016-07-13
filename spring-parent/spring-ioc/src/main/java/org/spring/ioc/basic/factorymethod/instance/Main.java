package org.spring.ioc.basic.factorymethod.instance;

import org.spring.ioc.basic.factorymethod.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory/instance-factory-method-example.xml");
		Department department = applicationContext.getBean("admin",Department.class);
		//System.out.println(department);
		
		/*Department department1 = applicationContext.getBean("admin",Department.class);
		System.out.println(department1);*/

		
		/*Department hr = applicationContext.getBean("hr",Department.class);
		System.out.println(hr);*/

		

	}

}
