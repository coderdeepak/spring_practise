package org.spring.ioc.basic.circulardependency.problem;

public class A {
	
	B b = null;
	public A(B b){
		this.b = b;
	}

}
