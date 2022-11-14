package com.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.Student;
import com.aop.bo.InstituteService;

@SpringBootApplication
public class AfterAdviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AfterAdviceApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student std = context.getBean("student", Student.class);
		InstituteService instituteService = (InstituteService) context.getBean("proxy");
		instituteService.enquiry(std, "java");
		instituteService.registration(std, "Python");
		
		
		((AbstractApplicationContext) context).close();
		
	}

}
