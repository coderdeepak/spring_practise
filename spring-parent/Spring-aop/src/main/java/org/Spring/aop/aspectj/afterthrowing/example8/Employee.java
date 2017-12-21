package org.Spring.aop.aspectj.afterthrowing.example8;

public class Employee {
	
	private String name;

	public String getName() {
		//return name;
		throw new NullPointerException();
	}

	public void setName(String name) {
		this.name = name;
	}

}
