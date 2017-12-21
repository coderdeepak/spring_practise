package org.Spring.aop.aspectj.example4;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * An aspect represents cross cutting concerns..
 * In this example EmployeeAspect is a cross cutting concern which has 2 advises getNameAdvise() and getAllAdvise().
 * @author Deepak.Keswani
 *
 */
@Aspect
public class EmployeeAspect {
	
	/*@Before annotation is used to create Before advice.
	 * The string parameter passed in the @Before annotation is the Pointcut expression.
	 * 
	 * getNameAdvise will be executed with any Spring Bean method with signature [public String getName()] 
	 */
	@Before("execution(public String getName())")
	public void getNameAdvise(){
		System.out.println("Executing Advice on getName()");
	}

	/*
	 * getAllAdvise will be executed before execution on any method that starts with "get" 
	 * in a Spring bean inside the package org.Spring.aop.aspectj.example4.*
	 * 
	 *  Joinpoint is the point at which below advise/action is called.
	 *  
	 *  All the methods that starts with "get" in the package org.Spring.aop.aspectj.example4.* are join points.
	 *  
	 *  so "org.Spring.aop.aspectj.example4.*.get*()" expression that matches joinpoint is called pointcut.
	 *  
	 *  Action taken by an aspect (EmployeeAspect) at particular joinpoint (before execution of all the methods that starts with get) is called advise.
	 *    
	 */
	@Before("execution(* org.Spring.aop.aspectj.example4.*.get*())")
	public void getAllAdvise(JoinPoint jp){
		System.out.println("****jp.getSignature()*******" + jp.getSignature() + "***jp.getTarget()***" + jp.getTarget() + "**jp.getSourceLocation()**" + jp.getSourceLocation() + "**jp.getKind()**"+ jp.getKind() + "**jp.getArgs()**" + jp.getArgs());
		
	}
	
	
}
