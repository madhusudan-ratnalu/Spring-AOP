package com.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.advice.CacheAdvice;
import com.aop.beans.Calculator;

@SpringBootApplication
public class MethodBeforeAdviceApplication {

	@Autowired
	static Calculator calculator;

	@Autowired
	static CacheAdvice cacheAdvice;

	public static void main(String[] args) {
		SpringApplication.run(MethodBeforeAdviceApplication.class, args);
		/*
		 * ProxyFactory pf = new ProxyFactory(); pf.setTarget(new Calculator());
		 * pf.addAdvice((Advice) new CacheAdvice());
		 * 
		 * Calculator proxy = (Calculator) pf.getProxy();
		 * 
		 * int sum2 = proxy.add(10, 20); System.out.println(sum2);
		 * 
		 * int sum3 = proxy.add(10, 20); System.out.println(sum3);
		 * 
		 * int sum4 = proxy.add(30, 40); System.out.println(sum4);
		 * 
		 * int sum5 = proxy.add(60, 20); System.out.println(sum5);
		 */

		calculator.add(100, 200);
	}

}
