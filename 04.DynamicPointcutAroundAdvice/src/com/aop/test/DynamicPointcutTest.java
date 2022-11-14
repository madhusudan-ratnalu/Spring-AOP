package com.aop.test;

import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

import com.aop.aspect.LoggingAdvice;
import com.aop.bean.Calculator;
import com.aop.pointcut.LoggingPointcut;

public class DynamicPointcutTest {
	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(new Calculator());
		Advisor loggingAdvice = new DefaultPointcutAdvisor(new LoggingPointcut(), new LoggingAdvice());

		proxyFactory.addAdvisors(loggingAdvice);

		Calculator proxy = (Calculator) proxyFactory.getProxy();
		int sum = proxy.addition(12, 20);
		System.out.println("add method sum is " + sum);

		int mul = proxy.multiply(10, 8);
		System.out.println("multiply method value is " + mul);
	}

}
