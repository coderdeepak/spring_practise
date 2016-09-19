package org.spring.ioc.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("annotations/autowire/bytype-qualifier.xml");
		AnimalService animalService = context.getBean(AnimalService.class); 
		Animal animal = animalService.getAnimal();
		animal.displayName();
	}
}
