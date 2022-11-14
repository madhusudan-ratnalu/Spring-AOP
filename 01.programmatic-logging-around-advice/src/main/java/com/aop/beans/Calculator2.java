package com.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator2 {

	public long division(long num1, long num2) {
		long total = num1 / num2;
		return total;
	}

}
