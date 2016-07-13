package org.spring.ioc.basic.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {

	public static void main(String[] args) {
		/*
		 * @1 Below statement loads the Spring container name it context. It
		 * reads file singleton-example.xml and loads all the beans defined in
		 * files. In this particular case it will load 2 beans 1 for admin ,
		 * other for hr.
		 * 
		 * so it will create 2 objects of CustomerService class (one for
		 * customer_id and 1 for customer_id1 bean). Two spring beans are
		 * created (spring container managed beans).
		 * 
		 * Technically Spring container creates a BeanDefination for every bean
		 * that it creates(in our case it is 2) and put it ConcurrentHashMap
		 * with key as beanId and value as BeanDefination object.
		 * 
		 * private final Map<String, BeanDefinition> beanDefinitionMap = new
		 * ConcurrentHashMap<String, BeanDefinition>(256);
		 * beanDefinitionMap.put("customer_id", BeanDefination(for
		 * customer_id)); beanDefinitionMap.put("customer_id1",
		 * BeanDefination(for customer_id1));
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"scope/singleton-example.xml");
		/*
		 * @2 Below statement requests to Spring container for bean customer_id.
		 * Spring container looks for the key customer_id in beanDefinitionMap
		 * get BeanDefination object and return corresponding
		 * Bean(CUstomerService object)
		 */

		CustomerService customer1 = context.getBean("customer_id",
				CustomerService.class);
		customer1.setMessage("First object created");
		System.out.println("message from first object-->"
				+ customer1.getMessage());

		System.out.println("Lets see what happens when we call it twice");
		/*
		 * @4 Below statement requests to Spring container for bean customer_id.
		 * Spring container looks for the key customer_id in beanDefinitionMap
		 * get BeanDefination object (This is the same object as was in previous
		 * request) and return corresponding Bean(CUstomerService object)
		 */
		CustomerService customer2 = context.getBean("customer_id",
				CustomerService.class);
		System.out
				.println("If returns new instance getMessage would return null , if it is same instance getMessage would return the meesage First object created ");
		System.out.println(customer2.getMessage());

		System.out
				.println("Lets see what happens when we call same bean with different id");
		/*
		 * @4 Below statement requests to Spring container for bean
		 * customer_id1. Spring container looks for the key customer_id in
		 * beanDefinitionMap get BeanDefination object and return corresponding
		 * Bean(CUstomerService object)
		 */
		CustomerService customer3 = context.getBean("customer_id1",
				CustomerService.class);
		System.out.println("message from first object-->"
				+ customer3.getMessage());
		System.out
				.println("Since it returns null ; it shows that new object is created.");

		/*
		 * @4 Initialize new Spring container with name context1. Now this
		 * container has its seperate BeanDefinationMap. This container again
		 * loads all the Beans as it was IN @1; hence 2 more objects of
		 * CustomerService bean are created one for customer_id and one for
		 * customer_id1
		 */

		ApplicationContext context1 = new ClassPathXmlApplicationContext(
				"scope/singleton-example.xml");

		System.out
				.println("Let's see what happens when we request for bean customer_id to speing container context1");
		CustomerService customer4 = context1.getBean("customer_id",
				CustomerService.class);
		System.out.println("message from first object-->"
				+ customer4.getMessage());
		System.out
				.println("Since context and context1 are 2 different spring container a new CustomerService object is created and customer4.getMessage() is null");
	}
}
