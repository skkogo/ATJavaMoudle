package com.day2;

public class AreaOfTriangle {
	public static void main(String[]args) {
	double a=CalculateAreaOfTriangle(20,40,50);
	System.out.println(a);
	System.out.println("cm cube");
	}
	public static double CalculateAreaOfTriangle(double side1,double side2,double side3) {
		System.out.println("The Area of Triangle is");
		double area=side1*side2*side3;
		return area;
		
	}
	

}
