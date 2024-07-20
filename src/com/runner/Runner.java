package com.runner;

public class Runner {
	public static void main(String[] args) {

		String env = args[0];

		String componentType = args[1];

		String testType = args[2];

		if (verifyEnvType(env) && verifyTestType(testType) && verifycomponentType(componentType)) {

			System.out.println("config recieved form run time arguments " +env+"|" + componentType+ "|" + testType);

			runTestNGTest();
		} else
			System.err.println("Stopping the test");

	}

	private static void runTestNGTest() {
		System.out.println("Starting the test");
	}

	private static boolean verifyEnvType(String env) {
		if (env.equalsIgnoreCase("dev") || env.equalsIgnoreCase("qa") || env.equalsIgnoreCase("prod"))
			return true;

		else
			System.err.println("invalid  EnvType...... Valid EnvTypes are : dev, qa, prod");
		return false;

	}

	public static boolean verifyTestType(String test) {
		if ((test.equalsIgnoreCase("regression")) || (test.equalsIgnoreCase("sanity"))
				|| (test.equalsIgnoreCase("smoke")))
			return true;
		else
			System.err.println("invalid testType......valid testTypes are : regression, sanity, smoke");
		return false;
	}

	public static boolean verifycomponentType(String component) {
		if (component.equalsIgnoreCase("ui") || component.equalsIgnoreCase("api"))
			return true;
		else
			System.err.println("invalid componentType......valid componentType are: ui,api");
		return false;

	}
}