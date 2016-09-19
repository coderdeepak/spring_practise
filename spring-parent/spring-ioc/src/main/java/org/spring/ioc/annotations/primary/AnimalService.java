package org.spring.ioc.annotations.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
	
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	@Autowired
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	

}
