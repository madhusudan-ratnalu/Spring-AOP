package com.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.advice.LoggingAdvice;
import com.aop.beans.Calculator;

@SpringBootApplication
public class MethodAroundAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodAroundAdviceApplication.class, args);
		
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new LoggingAdvice());
		pf.setTarget(new Calculator());

		Calculator proxy = (Calculator) pf.getProxy();
		
		int total = proxy.addition(10, 40);
		System.out.println(total); 
		
		total = proxy.substarct(555, 55);
		System.out.println(total); 
		
		total = proxy.multiply(11, 10);
		System.out.println(total);
		
	}

}
