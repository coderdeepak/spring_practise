package org.Spring.aop.aspectj.around.example6;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAspect {
	
	/* 
	 * Around advise surrounds the join point; it is invoked both before and after the execution of method.
	 * This is the most powerful kind of advice. Around advice can perform custom behavior before and after the method invocation.
	 *  It is also responsible for choosing whether to proceed to the join point or to shortcut the advised method execution by 
	 *  returning its own return value or throwing an exception. It can also be used to inspect the return value.
	 *  
	 *  Around advice are always required to have ProceedingJoinPoint as argument and we should use it’s proceed() method to invoke the target 
	 *  object advised method. If advised method is returning something, it’s advice responsibility to return it to the caller program. For void methods, 
	 *  advice method can return null. Since around advice cut around the advised method, we can control 
	 *  the input and output of the method as well as it’s execution behavior.
	 */
	@Around("execution(* org.Spring.aop.aspectj.around.example6.*.get*())")
	public Object logAroundJoinPoint(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before invoking method--->" + proceedingJoinPoint.getSignature() + "---" + proceedingJoinPoint.getTarget());
		Object employee=null;
		try {
			employee = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After invoking method--->" + proceedingJoinPoint.getSignature() + "---" + proceedingJoinPoint.getTarget());
		return employee;
	}

	
	
	
}
