package com.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

import com.aop.beans.Student;

public class ThankYouAdvice2 implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retValue, Method method, Object[] args, Object target) throws Throwable {
		Student std = (Student) args[0];
		String courseName = (String) args[1];
		
		
			System.out.println("Cal us on 89898989");
		System.out.println();
	}

}
