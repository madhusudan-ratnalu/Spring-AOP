package com.aop.beans;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
	
	public int add(int a, int b) {
		System.out.println("inside add()");
		return a + b;
	}

}
