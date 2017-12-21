package org.Spring.aop.aspectj.customannotation.example9;

public class Employee {
	
	private String name;

	@Loggable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
