package org.spring.ioc.annotations.resource;

import javax.annotation.Resource;

public class Employee {
	/**
	 * @Resource takes a name attribute, and by default Spring interprets 
	 * that value as the bean name to be injected. 
	 * In other words, it follows by-name semantics, 
	 * as demonstrated in this example: 
	 * 
	 * Spring will search for the bean mycompany in the container and inject it.
	 * If in Spring container if it haapens to be bean with name "mycompany"
	 * container will throw exception [No bean named 'mycompany' is defined] 
	 *  
	 */
	@Resource(name="mycompany")
	private Company company;
	
	/**
	 * If no name is specified explicitly, 
	 * the default name is derived from the field name or setter method. 
	 * In case of a field, it takes the field name; 
	 * in case of a setter method, it takes the bean property name.
	 * 
	 *  In this case it will search for the bean "address" (It is still autowire by name)
	 *  however if there is no bean of name address, 
	 *  it will search for the bean of Type Address and inject the same (Here it works as autowire by type)  
	 */
	
	@Resource
	private Address address;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
