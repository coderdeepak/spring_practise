package org.spring.ioc.basic.methodinjection;

public class Command {
	
	public Command(){
		System.out.println("a new command is created");
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
