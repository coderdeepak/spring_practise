package org.spring.ioc.annotations.primary;

import org.springframework.stereotype.Component;

/**
 * Tiger is a subclass of Animal. That is Tiger is a Animal.
 * @author Deepak.Keswani
 *
 */

@Component
public class Tiger extends Animal {

	@Override
	public void displayName() {
		System.out.println("This is Tiger");

	}

}
