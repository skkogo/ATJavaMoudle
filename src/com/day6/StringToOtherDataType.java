package com.day6;

public class StringToOtherDataType {
	public static void main(String[] args) {
		
		//how to convert Primitive DataType into String
		int number=10;
		String intNumber=""+number;
		System.out.println(intNumber+30);
		
		//how to convert String into Primitive Data Type
		String strinNumber="80";
		//wrapper class
		int intNum= Integer.parseInt(strinNumber);
		System.out.println(10+intNum);
		
		
	}
	

}
