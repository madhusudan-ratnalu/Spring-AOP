package com.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Around advice

public class LoggingAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object retValue = null;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();

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
		retValue = methodInvocation.proceed();
		System.out.println("exit from method " + methodName + " and return value is " + retValue);
		return retValue;

	}

}
