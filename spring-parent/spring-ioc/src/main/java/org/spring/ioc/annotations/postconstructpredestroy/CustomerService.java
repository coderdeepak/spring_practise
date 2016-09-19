package org.spring.ioc.annotations.postconstructpredestroy;

import javax.annotation.PostConstruct; // This is a JSR annotations
import javax.annotation.PreDestroy;//// This is a JSR annotations

public class CustomerService {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		System.out.println("Message being set");
		this.message = message;
	}
	
	@PostConstruct
	public void init() throws Exception{
		System.out.println("Init method after propeties are set");
	}
	
	@PreDestroy
	public void cleanUp() throws Exception{
		System.out.println("clean up before it is destroyed");
	}
	

}
