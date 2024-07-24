package com.singleton;

public class MySingleton {
	private static MySingleton s;

	private MySingleton() {

	}

	public static MySingleton x() {
		if (s == null) {
			s = new MySingleton();
		}
		return s;
	}

}
