package org.spring.ioc.annotations.qualifier;

import org.springframework.stereotype.Component;

@Component("lion")
public class Lion extends Animal {

	@Override
	public void displayName() {
		System.out.println("This is Lion");
	}
}
