package com.aop.aspect;


import org.aspectj.lang.JoinPoint;

public class AuditAdvice {

	public void audit(JoinPoint jp)// it is advice
	{
		System.out.println("BeforeAdvice called ");
		System.out.println(jp.getSignature());

	}
}