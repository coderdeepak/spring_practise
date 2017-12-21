package org.Spring.aop.common;

/*
 * Advise will be applied on the object of this class hence it is a Target object.
 */
public class SimpleService {

	private String name;
	private String id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void printNameId() {
		System.out.println("SimpleService : Method printNameId() : My name is "
				+ name + " and my id is " + id);
	}

	public void checkName() {
		if (name.length() < 20) {
			throw new IllegalArgumentException();
		}
	}

	public void sayHello(String message) {
		System.out.println("SimpleService : Method sayHello() : Hello! "
				+ message);
	}

}
