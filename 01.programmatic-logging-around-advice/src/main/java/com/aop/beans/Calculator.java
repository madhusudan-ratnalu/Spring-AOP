package com.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

	public int addition(int num1, int num2) {
		System.out.println("entered target class");
		int total = num1 + num2;
		System.out.println("exit from target class");
		return total;
	}

	public int substarct(int num1, int num2) {
		int total = num1 - num2;
		return total;
	}

	public int multiply(int num1, int num2) {
		int total = num1 * num2;
		return total;
	}

}

//around,after,before,throws,after returning