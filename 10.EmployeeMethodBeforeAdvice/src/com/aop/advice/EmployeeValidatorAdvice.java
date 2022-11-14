package com.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.aop.beans.Employee;

public class EmployeeValidatorAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		Employee emp = (Employee) args[0];
		String errorMessages = "";
		if (emp.getEno() < 100 || emp.getEno() > 999) {
			errorMessages += "employee no. must b 3 digit number";
			System.out.println(errorMessages);

		}
		if (emp.getEsal() < 20000 || emp.getEsal() > 50000) {
			errorMessages += "employee sal must b in between 20000 to 50000";
			System.out.println(errorMessages);
		}

		if (!emp.getEmail().endsWith("@gmail.com")) {
			errorMessages += "must end with @gmail.com";
			System.out.println(errorMessages);
		}
		if (!emp.getEmobile().startsWith("91-")) {
			errorMessages += "invalid mobile number";
			System.out.println(errorMessages);
		}

	}

}
