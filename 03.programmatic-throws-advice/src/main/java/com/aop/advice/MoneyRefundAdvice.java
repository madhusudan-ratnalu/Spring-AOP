package com.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class MoneyRefundAdvice implements ThrowsAdvice {
	public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
		System.out.println("Power failure exception movie is stopped plz come & collect your money");
	}

}
