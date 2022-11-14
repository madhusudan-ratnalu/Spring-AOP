package com.aop.aspect;

import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

//Around advice

public class LoggingAspect {

	public Object log(MethodInvocationProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object retValue = null;

		methodName = pjp.getSignature().getName();
		args = pjp.getArgs();

		System.out.print("Method reading started " + methodName + "( ");
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print("," + args[i]);
		}
		System.out.println(" )");

		//Modifying the argument
		args[0]=(Integer)args[0]+20;
		args[1]=(Integer)args[1]+40;
		
		
		//proceed calls target methods
		retValue = pjp.proceed();
		System.out.println("exit from method " + methodName + " and return value is " + retValue);
		return retValue;

	}

}
