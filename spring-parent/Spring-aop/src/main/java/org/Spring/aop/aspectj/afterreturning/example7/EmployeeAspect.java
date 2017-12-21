package org.Spring.aop.aspectj.afterreturning.example7;


import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	
	/* 
	 * 
	 * 
	 * 
	 */
	@AfterReturning(pointcut = "execution(* org.Spring.aop.aspectj.afterreturning.example7.*.get*())",returning="retVal")
	public void afterReturning(Object retVal){
		System.out.println("Value returned from method--->" + retVal);
	}
}
