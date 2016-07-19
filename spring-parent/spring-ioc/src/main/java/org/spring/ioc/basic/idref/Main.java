package org.spring.ioc.basic.idref;

import org.spring.ioc.basic.methodinjection.CommandManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext conext = new ClassPathXmlApplicationContext("idref/idref.xml");
		ClientBean clientBean = conext.getBean("client",ClientBean.class);
		System.out.println(" first---> "+clientBean.getTargetBean());
		System.out.println(" second---> "+clientBean.getTargetBeanName());
	}

}
