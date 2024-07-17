package com.day4;

public class IdentifyNumberPositiveOrNot {
	public static void main(String[]args) {
		VerifyPositivOrNegativeNum(-99);
	}
public static void	VerifyPositivOrNegativeNum(int number){
	if (number>0)
		System.out.println( number+ " is Positive Number");
	else
		System.out.println(number+ " is Negative Number");
		
	}

}
