package org.Spring.aop.aspectj.customannotation.example9;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspect {
	
	
	@Before("@annotation(org.Spring.aop.aspectj.customannotation.example9.Loggable)")
	public void beforeAdviseForCustomAnnotation(){
		System.out.println("This method is called only at methods which are annotated with @Loggable");
	}
}
