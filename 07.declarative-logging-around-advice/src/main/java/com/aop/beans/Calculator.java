package com.aop.beans;

public class Calculator {
	
	public int addition(int num1, int num2) {
		int total = num1 + num2;
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
