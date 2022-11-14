package com.aop.beans;

import java.util.Random;

public class LoanManager {
	
	public boolean approveLoan(int amount) {
		
		System.out.println("in approveLoan()");
		return new Random().nextBoolean();
	}

}
