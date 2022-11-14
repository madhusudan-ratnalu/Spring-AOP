package com.aop.cache;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Cache {
	public static Cache instance = null;
	private Map<String, Object> cacheMap = null;

	private Cache() {
		cacheMap=new HashMap<>();
	}

	public static synchronized Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, Object value) {
		cacheMap.put(key, value);
	}

	public Object get(String key) {
		return cacheMap.get(key);
	}

	public boolean containsKey(String key) {
		return cacheMap.containsKey(key);
	}
}
