package org.spring.ioc.beanlifecycle.example2;



public class CustomerService{

	public CustomerService(){
		System.out.println("Constructor customer service");
	}
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("message property set");
	}

	public void anyNameForDestroy() throws Exception {
		System.out.println("Bean being destroyed");

	}

	public void anyNameForInit() throws Exception {
		System.out.println("Bean being initialized");

	}

}
