package com.aop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aop.advice.AuditAdvice;
import com.aop.beans.LoanManager;

@SpringBootApplication
public class MethodBeforeAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodBeforeAdviceApplication.class, args);
		
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new AuditAdvice());
		pf.setTarget(new LoanManager());
		
		LoanManager proxy=(LoanManager) pf.getProxy();
		proxy.approveLoan(98789);
	}

}
