package org.spring.ioc.annotations.qualifier;

import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger extends Animal {

	@Override
	public void displayName() {
		System.out.println("This is tiger");
	}
}
