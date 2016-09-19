package org.spring.ioc.beanlifecycle.applicationcontextaware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-life-cycle/applicationcontextaware.xml");
		ApplicationContextAwareTest contextAware = context.getBean("application_context_aware_test_id",ApplicationContextAwareTest.class);
		ApplicationContext context2 = contextAware.getContext();
		TestBean testBean = context2.getBean("test_bean_id",TestBean.class);
		testBean.doTask();
		
		if(context==context2){
			System.out.println("both the contexts are same objects");
		}else{
			System.out.println("both the contexts are different objects");
		}
		
		TestBean testBean2 = context.getBean("test_bean_id",TestBean.class);
		
		if(testBean==testBean2){
			System.out.println("both the beans are same objects");
		}else{
			System.out.println("both the beans are different objects");
		}
	}

}
