package org.Spring.aop.aspectj.after.example5;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	
	/*@After annotation is used to create After advice.
	 * The string parameter passed in the @After annotation is the Pointcut expression.
	 * 
	 * getNameAdvise will be executed with any Spring Bean method with signature [public String getName()] 
	 */
	@After("execution(public String getName())")
	public void getNameAdvise(){
		System.out.println("Executing Advice on getName()");
	}

	/*
	 * getAllAdvise will be executed after execution of any method that starts with "get" 
	 * in a Spring bean inside the package org.Spring.aop.aspectj.example4.* 
	 */
	@After("execution(* org.Spring.aop.aspectj.after.example5.*.get*())")
	public void getAllAdvise(JoinPoint jp){
		System.out.println("****jp.getSignature()*******" + jp.getSignature() + "***jp.getTarget()***" + jp.getTarget() + "**jp.getSourceLocation()**" + jp.getSourceLocation() + "**jp.getKind()**"+ jp.getKind() + "**jp.getArgs()**" + jp.getArgs());
	}
}
