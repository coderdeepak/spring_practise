package org.spring.ioc.basic.factorymethod.staticf;

import org.spring.ioc.basic.factorymethod.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		/*
		 * Below statement loads the Spring container. It read file static-factory-method-example.xml 
		 * and loads all the beans defined in files. In this particular case it will load 2 beans 1 for admin , other for hr.
		 * 
		 * so it will create 2 objects of Department class (one for admin and 1 for hr bean).
		 * It is actually DepartmentFactory which is creating the objects for the first time.
		 * Spring container creates corressponding bean (bean which is managed by spring container).
		 * 
		 * Technically Spring container creates a BeanDefination for every bean that it creates(in our case it is 2) and put it ConcurrentHashMap
		 * with key as beanId and value as BeanDefination object.
		 * 
		 * private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>(256);
		 * beanDefinitionMap.put("admin", BeanDefination(for admin));
		 * beanDefinitionMap.put("hr", BeanDefination(for hr));
		 *       
		 */
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("factory/static-factory-method-example.xml");
		
		/* @1
		 * Below statement asks for admin bean from Spring container. Spring container looks for key admin 
		 * in its beanDefinationMap and returns corressponding Department object 
		 */
		Department admin = applicationContext.getBean("admin",Department.class);
		System.out.println(admin);
		/* @2 
		 * Below statement asks for admin bean from Spring container. Spring container looks for key admin 
		 * in its beanDefinationMap and returns corressponding Department object 
		 */
		Department newAdmin = applicationContext.getBean("admin",Department.class);
		System.out.println(newAdmin);
		/*
		 * @3 Below statement asks for admin bean from Spring container. Spring container looks for key admin 
		 * in its beanDefinationMap and returns corressponding Department object 
		 */
		Department hr = applicationContext.getBean("hr",Department.class);
		System.out.println(hr);
		
		
	}
}
