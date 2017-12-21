package org.Spring.aop.aspectj.afterthrowing.example8;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	
	/* 
	 * This advise is invoked if method(joinpoint) exits with an exception.
	 * 
	 */
	@AfterThrowing(pointcut = "execution(* org.Spring.aop.aspectj.afterthrowing.example8.*.get*())", throwing = "ex")
	public void afterReturning(Exception ex){
		System.out.println("Method exixted by throwing exception-->" + ex.getCause());
	}
}
