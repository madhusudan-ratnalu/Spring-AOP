package com.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.advice.CacheAdvice;
import com.aop.advice.LoggingAdvice;
import com.aop.beans.Calculator;

@SpringBootApplication
public class MethodBeforeAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodBeforeAdviceApplication.class, args);
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget(new Calculator());
		pf.addAdvice(new CacheAdvice());
		pf.addAdvice(new LoggingAdvice());
		
		Calculator proxy = (Calculator) pf.getProxy();

		int sum2 = proxy.add(10, 20);
		System.out.println(sum2);
		
		int sum3 = proxy.add(10, 20);
		System.out.println(sum3);

		int sum4 = proxy.add(30, 40);
		System.out.println(sum4);

		int sum5 = proxy.add(60, 20);
		System.out.println(sum5);	
	
		}

}
