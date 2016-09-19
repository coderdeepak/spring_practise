package org.spring.ioc.annotations.qualifier;

import org.springframework.stereotype.Component;

@Component("deer")
public class Deer extends Animal {
	@Override
	public void displayName() {
		System.out.println("This is Deer");
	}
}
