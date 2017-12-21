package org.Spring.aop.common;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * This is an Advise (precisely before advise)
 * @author Deepak.Keswani
 *
 */
public class DoBeforeMethod implements MethodBeforeAdvice{

	/**
	 * This advise (method below) is executed before a method execution.
	 * a method execution? which method? Please check comments of example1.xml   
	 */
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
	}

}
