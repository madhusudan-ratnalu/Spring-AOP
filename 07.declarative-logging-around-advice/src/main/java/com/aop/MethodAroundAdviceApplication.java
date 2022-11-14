package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.Calculator;

@SpringBootApplication
public class MethodAroundAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodAroundAdviceApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calculator proxy = (Calculator) context.getBean("calculator", Calculator.class);
		
		int total = proxy.addition(10, 40);
		System.out.println(total); 
		
		total = proxy.substarct(555, 55);
		System.out.println(total); 
		
		total = proxy.multiply(11, 10);
		System.out.println(total);
		
	
		
		((AbstractApplicationContext) context).close();
	}

}
