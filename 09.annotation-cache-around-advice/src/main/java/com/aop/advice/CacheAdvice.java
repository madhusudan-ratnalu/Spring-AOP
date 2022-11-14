package com.aop.advice;

import org.aopalliance.intercept.Invocation;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

import com.aop.cache.Cache;

@Aspect
@Service
public class CacheAdvice {

	@Pointcut("execution(* com.aop.beans.add(..))")
	public void selectAdd() {
	}

	@Around("selectAdd()")
	public Object getCachedObject(ProceedingJoinPoint pjp) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;
		Cache cache = null;
		Object ret;
		
		methodName = ((MethodInvocation) pjp).getMethod().getName();
		args = ((Invocation) pjp).getArguments();

		key = methodName + "(";
		for (int i = 0; i < args.length; i++) {
			if (i == 0) {
				key = key + args[i];
				continue;
			}
			key = key + "," + args[i];
		}
		key = key + ")";

		cache = Cache.getInstance();
		if (cache.containsKey(key)) {
			return cache.get(key);
		}
		ret = pjp.proceed();
		cache.put(key, ret);
		return ret;
	}

}
