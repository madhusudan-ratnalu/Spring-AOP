package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.LoanManager;

@SpringBootApplication
public class MethodBeforeAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodBeforeAdviceApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LoanManager loanManager = (LoanManager) context.getBean("loanManager");

		loanManager.approveLoan();
		
		((AbstractApplicationContext) context).close();
	}

}
