package com.aop.epam.aspect;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	Log log = LogFactory.getLog(LoggingAspect.class);

	@Pointcut("execution(* com.aop.epam.controller.*.*(..))")
	public void loggingPointCut() {
	}

	@Around("loggingPointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("Before method invoked::" + joinPoint.getArgs()[0]);
		Object object = joinPoint.proceed();

		log.info("After method invoked..." + joinPoint.getArgs()[0]);

		return object;
	}
}
