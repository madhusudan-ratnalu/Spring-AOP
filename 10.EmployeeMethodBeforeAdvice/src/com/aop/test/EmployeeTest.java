package com.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.beans.Employee;
import com.aop.bo.EmployeeService;
import com.aop.bo.EmployeeServiceImpl;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/aop/commons/application-Context.xml");
		Employee emp=ctx.getBean("employee",Employee.class);
		EmployeeService employeeService= ctx.getBean("empProxy",EmployeeService.class);
		employeeService.displayEmployee(emp);
		employeeService.getEmployeeDetails(emp);
		
	}

}
