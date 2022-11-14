package com.aop.bean;

public class Calculator {
	public int addition(int a, int b) {
		System.out.println("inside addition method");
		return a + b;
	}

	public int substract(int a, int b) {
		System.out.println("inside substract method");
		return a - b;
	}

	public int multiply(int a, int b) {
		System.out.println("inside multiply method");
		return a * b;
	}

}
