package org.spring.ioc.beanlifecycle.example1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CustomerService implements InitializingBean, DisposableBean {

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

	public void destroy() throws Exception {
		System.out.println("Bean being destroyed");

	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean being initialized");

	}

}
