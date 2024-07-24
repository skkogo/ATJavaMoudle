package com.singleton;

public class Runner {
	public static void main(String[] args) {

		MySingleton y = MySingleton.x();
		System.out.println(y);

		MySingleton z = MySingleton.x();
		System.out.println(z);
	}
}