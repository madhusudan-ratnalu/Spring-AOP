package com.aop.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		Object retValue = null;

		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();

		System.out.println(methodName + "(");
		for (int i = 0; i <= args.length; i++) {
			if (i == 0) {
				System.out.println(args[i]);
				continue;
			}
			System.out.println("," + args[i]);
		}
		System.out.println(")" + "  method called");
		retValue = methodInvocation.proceed();
		System.out.println("method completed its executionn with a return value of" + retValue);
		return retValue;
	}

}
