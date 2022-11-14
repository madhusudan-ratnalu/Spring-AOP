package com.aop.advice;

import java.util.Calendar;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//Around advice
public class PerformanceCheckAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object retValue = null;

		methodName = methodInvocation.getMethod().getName();
		long startTime = Calendar.getInstance().getTimeInMillis();
		retValue = methodInvocation.proceed();
		long endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println(methodName+"()"+" takes "+(endTime-startTime)+" milli Seconds ");
		return retValue;

	}

}
