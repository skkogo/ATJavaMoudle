package com.day4;

public class IdentifyMaxNumber {
	public static void main(String[]args) {
		VerifyMaxNumber(800, 80);
	}
public static void	VerifyMaxNumber(double number1, double number2){
	if (number1>number2)
		System.out.println(number1+ " is max");
	else if (number1==number2)
		System.out.println("Both numbers are equal");
	else
		System.out.println(number2 + " is max");
		
	}

}
