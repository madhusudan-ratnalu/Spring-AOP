package com.aop.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.aop.bean.Calculator;

public class LoggingPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> classType, Object... args) {

		String methodName = method.getName();
		int a = (int) args[0];
		int b = (int) args[1];

		if (classType.isAssignableFrom(Calculator.class) && methodName.equals("multiply")) {
			if (a > 100 && b < 300) {
				return true;
			}
		}
		return false;
	}

}
