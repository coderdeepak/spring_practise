package org.spring.ioc.basic.circulardependency.problem;

public class B {
	
	A a= null;
	public B(A a){
		this.a = a;
	}

}
