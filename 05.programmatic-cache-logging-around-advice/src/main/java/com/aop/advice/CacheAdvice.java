package com.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.aop.cache.Cache;

public class CacheAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		String methodName = null;
		Object[] args = null;
		String key = null;
		Cache cache = null;
		Object ret;
		methodName = methodInvocation.getMethod().getName();
		args = methodInvocation.getArguments();

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
		ret = methodInvocation.proceed();
		cache.put(key, ret);
		return ret;
	}

}
