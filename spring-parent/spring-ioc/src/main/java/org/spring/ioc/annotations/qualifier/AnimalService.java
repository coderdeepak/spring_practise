package org.spring.ioc.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalService {
	
	private Animal animal;

	public Animal getAnimal() {
		return animal;
	}
	@Autowired
	@Qualifier("deer")
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
}
