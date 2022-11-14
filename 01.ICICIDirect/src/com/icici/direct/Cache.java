package com.icici.direct;

import java.util.Map;

public class Cache {
	private Map<String, Object> dataMap;
	static Cache instance;

	private Cache() {
		super();
	}

	public synchronized static Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, String value) {
		dataMap.put(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean containsKey(String key) {
		return dataMap.containsKey(key);
	}
}
