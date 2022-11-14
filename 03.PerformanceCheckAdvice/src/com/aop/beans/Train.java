package com.aop.beans;

import java.util.Random;

public class Train {
	
	public int start() {
		return new Random().nextInt(2);
	}

}
