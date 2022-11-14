package com.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import com.aop.advice.PerformanceCheckAdvice;
import com.aop.beans.Train;

public class PerformanceMonitorTest {

	public static void main(String[] args) {
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new PerformanceCheckAdvice());
		pf.setTarget(new Train());

		Train proxy = (Train) pf.getProxy();
		int trainNo = proxy.start();
		if (trainNo == 1) {
			System.out.println("train started towards destination");
		} else {
			System.out.println("train did not started yet");
		}

	}

}
