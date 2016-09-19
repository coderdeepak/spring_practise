package org.spring.ioc.annotations.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Lion is a subclass of Animal. That is Lion is a Animal.
 * Lion is declared as primary. 
 * This means that if anywhere Animal is autowired by type, 
 * an instance of Lion will be injected
 * 
 * @author Deepak.Keswani
 *
 */

@Component
@Primary
public class Lion extends Animal {

	@Override
	public void displayName() {
		System.out.println("THis is Lion");

	}

}
