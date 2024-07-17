package com.day3;

public class CalculatorForAddSubDivMul {
	public static void main(String[] args) {
		double x = addition(30, 40);
		System.out.println("result of addition is " + x);

		double y = subtraction(80, 9);
		System.out.println("result of subtraction is " + y);

		double z = Multiplication(90, 8);
		System.out.println("result of Multiplication is " + z);

		double d = Division(80, 7);
		System.out.println("result of Divison is " + d);
	}

	public static double addition(double firstvalue, double secondvalue) {
		double result = firstvalue + secondvalue;
		return result;
	}

	public static double subtraction(double firstvalue, double secondvalue) {
		double result = firstvalue - secondvalue;
		return result;

	}

	public static double Multiplication(double firstvalue, double secondvalue) {
		double result = firstvalue * secondvalue;
		return result;

	}

	public static double Division(double firstvalue, double secondvalue) {
		double result = firstvalue / secondvalue;
		return result;
	}
}
