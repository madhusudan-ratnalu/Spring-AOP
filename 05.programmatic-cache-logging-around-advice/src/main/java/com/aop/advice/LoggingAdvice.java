package com.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		
		String methodName=null;
		Object[] args=null;
		Object retValue=null;
		methodName=methodInvocation.getMethod().getName();
		args=methodInvocation.getArguments();
		
		System.out.print("started reading the method "+methodName+"(");
		for(int i=0;i<args.length;i++) {
			if(i==0) {
				System.out.print(args[i]);
				continue;
			}
			System.out.print(","+args[i]);
		}
		System.out.println(")");
		
		retValue=methodInvocation.proceed();
		System.out.println("exit from method "+methodName+" and return value is "+retValue);
		
		return retValue;
	}
}